package com.org.vivek;

public class DrawShape implements Shape {

	@Override
	public  void draw() {
		
	}
	
	public static int drawNew() throws Exception
	{
		
		try
		{
			//return 1;
			int a=2/0;
		}
		catch(Exception e)
		{
			//return 2;
			throw new Exception();
		}
		/*finally
		{
			System.out.println("11");
		}*/
		System.out.println("out");
		return 9;
	}
	
	public static void main(String[] args) throws Exception {
		int a=drawNew();
		System.out.println(a);
	}

}
