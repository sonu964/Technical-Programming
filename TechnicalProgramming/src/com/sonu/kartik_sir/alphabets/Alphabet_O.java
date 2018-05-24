package com.sonu.kartik_sir.alphabets;

public class Alphabet_O {

	public static void main(String[] args) 
	{
		int n = 7;
		for (int row = 0; row <n; row++) 
		{
			for (int col = 0; col <n; col++) 
			{
				if(row==0&&col!=0&&col!=n-1 || col==n-1&&row!=0&&row!=n-1 || row==n-1&&col!=0&&col!=n-1 ||col==0&&row!=0&&row!=n-1)
				{
					System.out.print("O ");
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
