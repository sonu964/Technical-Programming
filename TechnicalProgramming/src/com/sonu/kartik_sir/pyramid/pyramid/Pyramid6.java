package com.sonu.kartik_sir.pyramid.pyramid;

public class Pyramid6 
{

	public static void main(String[] args) 
	{
		int n=4;
		for (int row = 0; row <n; row++)
		{
			for (int space = 0; space <n-1-row; space++) 
			{
				System.out.print("  ");
			}
			for (int star = 0; 2*row>=star; star++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int row = n-1; row >=0; row--)
		{
			for (int space = 0; space <n-1-row; space++) 
			{
				System.out.print("  ");
			}
			for (int star = 0; 2*row>=star; star++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
