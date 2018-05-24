package com.sonu.kartik_sir.alphabets;

public class Alphabet_Y {

	public static void main(String[] args) 
	{
		int n = 9;
		for (int row = 0; row <n; row++) 
		{
			for (int col = 0; col <n; col++) 
			{
				if(row==col&&row<=n/2 || row+col==n-1 && row<=n/2 || col==n/2&&row>=n/2)
				{
					System.out.print("Y ");
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
