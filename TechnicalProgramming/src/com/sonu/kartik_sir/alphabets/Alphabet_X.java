package com.sonu.kartik_sir.alphabets;

public class Alphabet_X {

	public static void main(String[] args)
	{
		int n = 9;
		for (int row = 0; row <n; row++) 
		{
			for (int col = 0; col <n; col++) 
			{
				if(row==col || row+col==n-1)
				{
					System.out.print("X ");
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
