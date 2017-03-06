package com.org.vivek;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {

	public static void main(String[] args) {
		
		long start=System.nanoTime();
		List<Integer> mal=new MyArrayList<Integer>();
		//List<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			mal.add(i);
			//al.add(i);
		}
		mal.add(3,10);
		mal.add(23);
		//System.out.println(System.nanoTime()-start);
		System.out.println("Size=="+mal.size());
		System.out.println("Is empty=="+mal.isEmpty());
		System.out.println("mal.contains(7)=="+mal.contains(7));
		System.out.println("First indexOf 4=="+mal.indexOf(4));
		System.out.println("Index Of 7=="+mal.indexOf(7));
		System.out.println("Last index of 4=="+mal.lastIndexOf(4));
		mal.remove(3);
		for(int i=0;i<mal.size();i++)
			System.out.println(mal.get(i));
	}

}
