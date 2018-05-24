package com.sonu.sample;

public class Demo 
{

	public static void main(String[] args)
	{
		int n= 5;
		
		for (int i = 0; i < n; i++) 
		{
			
			for (int k = 0; k <=n-1-i; k++)
			{
				System.out.print("  ");
			}
			
			for (int j = 0; j <=2*i ; j++)
			{
				if( j==0|| j==2*i)
			System.out.print("* ");	
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
		
		for (int i = n-2; i >=0; i--) 
		{
			
			for (int k = 0; k <=n-1-i; k++)
			{
				System.out.print("  ");
			}
			
			for (int j = 0; j <=2*i ; j++)
			{
				if( j==0|| j==2*i)
					System.out.print("* ");	
						else
							System.out.print("  ");	
			}
			System.out.println();
			
		}
		
	}
	
}
