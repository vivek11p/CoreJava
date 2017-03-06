package com.org.vivek;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a={12,442,66,234,86,42,333,673,3,90};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}

		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
