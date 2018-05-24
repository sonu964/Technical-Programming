package com.sonu.kartik_sir.TrianglePattern;

public class Triangle5 {

	public static void main(String[] args)
	{

		int n=7;
		for (int row = 0; row < n; row++)
		{
			for (int col=0; row+col<=n-1; col++) 
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
