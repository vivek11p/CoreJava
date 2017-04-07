package com.org.vivek;


class MyLinkedList {

	private Node start;
	private Node end;
	private int size;
	
	public MyLinkedList()
	{
		start=null;
		end=null;
		size=0;
	}
	
	public MyLinkedList(Node start,Node end,int size)
	{
		this.start=start;
		this.end=end;
		this.size=size;
	}
	
	public void insertAtStart(int element)
	{
		Node n=new Node();
		n.setData(element);
		if(start==null)
			start=n;
		else
		{
			n=start;
			start=n;
		}
	}
	
	public class Node
	{
		private int data;
		private Node link;
		
		public Node()
		{
			data=0;
			link=null;
		}
		
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getLink() {
			return link;
		}
		public void setLink(Node link) {
			this.link = link;
		}
	}
}

public class MyLinkedListTest
{
	public static void main(String[] args) {
		MyLinkedList my=new MyLinkedList();
		my.insertAtStart(10);
	}
	
}
