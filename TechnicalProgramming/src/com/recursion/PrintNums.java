package com.recursion;



public class PrintNums 
{
	static int x=10;
	public static void count()
	{
		if(x==1)
		{
			return;
		}
		System.out.print(--x+" ");
		count();
		return;
		
	}
	
	public static void count2()
	{
		
		if(x==9)
		{
			return;
		}
		System.out.print(++x +" ");
		count2();
		return;
		
	}
	
	public static void main(String[] args)
	{
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		int x=10;*/
		count();
		count2();

	}

	
	}