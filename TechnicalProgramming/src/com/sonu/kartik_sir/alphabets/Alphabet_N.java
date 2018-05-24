package com.sonu.kartik_sir.alphabets;

public class Alphabet_N {

	public static void main(String[] args)
	{
		int n = 9;
		for (int row = 0; row <n; row++) 
		{
			for (int col = 0; col <n; col++) 
			{
				if(col==0 || col==n-1 || col==row)
				{
					System.out.print("N ");
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
