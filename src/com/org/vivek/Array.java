package com.org.vivek;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// How to find all pairs in array of integers whose sum is equal to given number

public class Array {

	public static void main(String[] args) {

		try {
			BufferedReader br=new BufferedReader(new FileReader("C:\\Projects\\ArrayInput.txt"));
			String sCurrentLine=null;
			int num=10;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				String[] sArray=sCurrentLine.split(",");
				int[] arr=new int[sArray.length];
				for(int i=0;i<sArray.length;i++)
					arr[i]=Integer.valueOf(sArray[i]);
				for(int j=0;j<arr.length;j++)
				{
					for(int k=j;k<arr.length-1;k++)
					{
						if(arr[j]+arr[k]==num)
						{
							System.out.println(arr[j]+" and "+arr[k]+" add up to "+num);
						}
					}
				}
				
				// Finding second highest number in array
				int first=arr[0];
				int second=arr[1];
				if(arr[0]>arr[1])
				{
					first=arr[0];
					second=arr[1];
				}
				else
				{
					first=arr[1];
					second=arr[0];
				}
				for(int m=2;m<arr.length;m++)
				{
					if(arr[m]>first)
					{
						second=first;
						first=arr[m];
					}
					else if(arr[m]>second)
					{
						second=arr[m];
					}
				}
				System.out.println("First two highest numbers are "+first+" "+second);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
