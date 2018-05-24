package com.sonu.kartik_sir.pyramid.pyramid;

public class Pyramid5 
{

	public static void main(String[] args)
	{
		int n=5;
		for (int row = n-1; row >=0; row--)
		{
			
			for (int space = 0; space < n-1-row; space++) 
			{
				System.out.print("  ");
			}
			for (int col = 0; 2*row>=col; col++) 
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
