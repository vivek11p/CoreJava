package com.org.bitwise;

import java.util.Arrays;

public class CombineArray {

	public static void main(String[] args) {
		
		// Stopwatch timer = new Stopwatch().start();
		int[] a={2,8,12,24,34,88,110,113,116,119,125,138,145,167,254,376,857,999,1045,2322,3214};
		int[] b={21,24,45,66,68,72,90,108,222,534,656,777,1023,2098,3454};
		long startTime = System.nanoTime();
		int len=a.length+b.length;
		int[] c=new int[len];
		
		int aCount=0,bCount=0;
		for(int i=0;i<len;i++)
		{
			c[i]=a[aCount]<b[bCount]?a[aCount]:b[bCount];
			if(c[i]==a[aCount])
			{
				if(aCount<a.length-1)
					aCount++;
				else
				{
					for(int k=bCount;k<b.length;k++)
					{
						c[i+1]=b[k];
						i++;
					}
					break;
				}
			}
			else
			{
				if(bCount<b.length-1)
				bCount++;
				else
				{
					for(int k=aCount;k<a.length;k++)
					{
						c[i+1]=a[k];
						i++;
					}
					break;
				}
			}
		}
		for(int k=0;k<len;k++)
			System.out.print(" "+c[k]+" ");
		long endTime = System.nanoTime();
		System.out.println("\n"+(endTime-startTime));
	}
	
	/*public static int compare(int x,int y)
	{
		if(x<y)
			return x;
		else 
			return y;
	}*/

}
