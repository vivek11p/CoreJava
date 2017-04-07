package com.org.vivek;

public class GeneralProgramming {

	public static void main(String[] args) {

		powerOfTwo();
	}

	private static void powerOfTwo()
	{
		int num=129;
		boolean flag=true;
		while(num>1){
			if(num%2!=0)
			{
				flag=false;
				break;
			}
			num=num/2;
		}
		if(flag)
			System.out.println("The number is power of two");
		else
			System.out.println("The number is NOT a power of two");
	}
}
