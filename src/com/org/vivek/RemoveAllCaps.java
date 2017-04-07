package com.org.vivek;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllCaps {

	public static void main(String[] args) { 
	       List<String> s=new ArrayList<>();
	       s.add("asdAa");
	       s.add("asdasd");
	       s.add("AADAD");
	       s.add("fsdADD");
	       s.add("SD");
	       s.add("fsd");
	       s.add("ASDdfsd");
	       System.out.println(s);
	       filter(s);
	       System.out.println(s);
	    }
		public static void filter(List<String> l)
		{
			for(int i=0;i<l.size();i++)
			{
				String s=l.get(i);
				String m=s.toUpperCase();
				if(s.equals(m))
				{
					l.remove(i);
				}
			}
		}
}
