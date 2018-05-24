package com.sonu.kartik_sir.alphabets;

public class Alphabet_V {

	public static void main(String[] args) 
	{
		int n = 11;
		for (int row = 0; row <n; row++) 
		{
			for (int col = 0; col <n; col++) 
			{
				if(col==row&&row<=n/2 || (row+col)==n-1 && row<=n/2)
				{
					System.out.print("V ");
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
