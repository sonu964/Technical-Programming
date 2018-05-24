package com.sonu.kartik_sir.alphabets;

public class Alphabet_F 
{

	public static void main(String[] args) 
	{

		int n = 7;
		for (int row = 0; row <n; row++) 
		{
			for (int col = 0; col <n; col++) 
			{
				if(row==0 || col==0 || row==n/2&&col!=n-1&&col!=n-2)
				{
					System.out.print("F ");
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
