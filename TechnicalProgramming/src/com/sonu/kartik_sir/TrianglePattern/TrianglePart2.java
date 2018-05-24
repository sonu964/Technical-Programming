package com.sonu.kartik_sir.TrianglePattern;

public class TrianglePart2 {

	public static void main(String[] args)
	{
		int n=7;
		for (int row = 0; row < n; row++) 
		{
			for (int col = 0; col < n; col++) 
			{
				if(row<=col)
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
