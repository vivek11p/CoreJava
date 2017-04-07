package com.org.vivek;

public class EvenOddWithoutOperator {

	public static void main(String[] args) {

		int num=7;
		while(num>0)
		{
			num=num-2;
		}
		if(num==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		//Method 2
		String s=Integer.toBinaryString(124);
		char ch=s.charAt(s.length()-1);
		if(ch=='1')
			System.out.println("Odd");
		else
			System.out.println("even");
	}

}
