package com.sonu.kartik_sir.alphabets;

public class Alphabet_K {

	public static void main(String[] args)
	{
		int n = 11;
		for (int row = 0; row <n; row++) 
		{
			for (int col = n/2; col <n; col++) 
			{
				if(col==n/2 || (row+col)==n-1 || row == col)
				{
					System.out.print("K ");
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
