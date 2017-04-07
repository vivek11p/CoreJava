package com.org.vivek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Set<Employee> s=new HashSet<>();
		Employee e1=new Employee("Vivek",25);
		Employee e2=new Employee("Varun",21);
		Employee e3=new Employee("Pranav",32);
		/*Employee e4=new Employee("Varun",67);
		Employee e5=new Employee("Salman",88);
		Employee e6=new Employee("Salman",88);*/
		//s.add(null);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		/*s.add(e4);
		s.add(e5);
		s.add(e6);
		*/
		/*Set<String> ss=new HashSet<>();
		ss.add("A");
		ss.add("B");
		String c="A";
		String d=new String("A");
		String e=c;
		ss.add(c);
		ss.add(d);
		ss.add(e);
		System.out.println("sss===="+ss);
		System.out.println("A"==c);
		System.out.println(c==d);
		System.out.println("A".hashCode());
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());*/
		
		System.out.println(s);
		/*Map<Employee,Integer> m=new HashMap<>();
		m.put(e1,e1.getEmpId());
		m.put(e2,e2.getEmpId());
		m.put(e3,e3.getEmpId());
		m.put(null, 2);
		System.out.println(m);
		System.out.println("Hashcode of e1="+e1.hashCode());
		System.out.println("Hashcode of e3="+e3.hashCode());
		System.out.println("Hashcode of e2="+e2.hashCode());*/
		
		/*List al=new ArrayList();
		al.add(2);
		al.add(3);
		al.add(5);
		al.remove(2);
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));*/
		
	}

}
