package com.org.bitwise;

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
		
		/*Set<Employee> s=new TreeSet<>();
		Employee e1=new Employee("Vivek",25);
		Employee e2=new Employee("Varun",21);
		Employee e3=new Employee("Pranav",32);
		Employee e4=new Employee("Varun",67);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		System.out.println(s);
		Map<Employee,Integer> m=new HashMap<>();
		m.put(e1,e1.getEmpId());
		m.put(e3,e3.getEmpId());
		m.put(e2,e2.getEmpId());
		m.put(null, 2);
		System.out.println(m);*/
		
		List al=new ArrayList();
		al.add(2);
		al.add(3);
		al.add(5);
		al.remove(2);
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		
	}

}
