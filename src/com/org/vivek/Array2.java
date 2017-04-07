package com.org.vivek;

public class Array2 {

	public static void main(String[] args) {

		//unequalArrays();
		//missingNumber();
		duplicateNumber();
	}

	private static void unequalArrays()
	{
		int[] a1={1,2,3,4,5};
		int[] a2={2,3,1,0,5};
		for(int i=0;i<a1.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			System.out.println(a1[i]);
		}
	}
	private static void missingNumber()
	{
		int[] a={2,5,1,7,3,6,10,9,4};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int sumOfNumbers=10*11/2;
		int missingNumber=sumOfNumbers-sum;
		System.out.println(missingNumber);
	}
	
	private static void duplicateNumber()
	{
		int[] a={2,5,1,7,3,6,10,9,4,6,8};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int sumOfNumbers=10*11/2;
		int missingNumber=sum-sumOfNumbers;
		System.out.println(missingNumber);
	}
}
