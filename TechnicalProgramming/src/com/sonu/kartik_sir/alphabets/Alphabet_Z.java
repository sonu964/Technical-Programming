package com.sonu.kartik_sir.alphabets;

public class Alphabet_Z {

	public static void main(String[] args) 
	{
		int n = 9;
		for (int row = 0; row <n; row++) 
		{
			for (int col = 0; col <n; col++) 
			{
				if(row==0 || row+col==n-1 ||row==n-1)
				{
					System.out.print("Z ");
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
