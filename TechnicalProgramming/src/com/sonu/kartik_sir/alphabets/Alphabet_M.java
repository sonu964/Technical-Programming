package com.sonu.kartik_sir.alphabets;

public class Alphabet_M {

	public static void main(String[] args)
	{
		int n = 9;
		for (int row = 0; row <n; row++) 
		{
			for (int col = 0; col <n; col++) 
			{
				if(col==0 || col==n-1|| (row+col)==n-1&&row<=n/2 || row==col&&row<=n/2)
				{
					System.out.print("M ");
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
