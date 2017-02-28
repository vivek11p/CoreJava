package com.org.bitwise;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {

		Stack<Integer> st=new Stack<Integer>();
		st.push(22);
		st.push(33);
		st.push(44);
		st.push(55);
		st.push(66);
		reverseStack1(st);
	}
	
	private static void reverseStack1(Stack<Integer> st)
	{
		Stack<Integer> rst=new Stack<>();
		int size=st.size();
		for(int i=0;i<size;i++)
		{
			rst.push(st.pop());
		}
		System.out.println(rst);
	}
}
