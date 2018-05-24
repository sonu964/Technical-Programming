package com.sonu.kartik_sir.TrianglePattern;

public class Arrow2 {

	public static void main(String[] args) 
	{
		int n=7;
		int a =(n-1)/2;
		//int b=3*n/2 -1;
		for (int row = 0; row < n; row++) 
		{
			for (int col = 0; col < n; col++)
			{
				if(col==n/2 || col+row==a || col-row==a )
					
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}


	}

}
