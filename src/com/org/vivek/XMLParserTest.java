package com.org.vivek;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParserTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		//String xml = "";

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File("ConfigureExample.xml"));
		Element rootElement = document.getDocumentElement();
		System.out.println(rootElement.getNodeName());
		NodeList nlist=rootElement.getChildNodes();
		getNode(nlist);
		//String requestQueueName = getString("Request", rootElement);
		//System.out.println(requestQueueName);
	}
	
	public static void getNode(NodeList nlist)
	{
		for(int i=0;i<nlist.getLength();i++)
		{
			if(nlist.item(i).getNodeType()==Node.ELEMENT_NODE)
			System.out.println(nlist.item(i).getNodeName());
			/*else
				getNode(nlist.item(i));*/
		}
	}
	
	public static String getString(String tagName, Element element) {
        NodeList list = element.getElementsByTagName(tagName);
        if (list != null && list.getLength() > 0) {
            NodeList subList = list.item(0).getChildNodes();

            if (subList != null && subList.getLength() > 0) {
                return subList.item(0).getNodeValue();
            }
        }
        return null;
    }
}
