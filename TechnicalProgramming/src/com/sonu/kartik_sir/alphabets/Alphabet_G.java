package com.sonu.kartik_sir.alphabets;

public class Alphabet_G {

	public static void main(String[] args) 
	{

		int n = 9;
		for (int row = 0; row <n; row++) 
		{
			for (int col =0; col <n; col++) 
			{
				if(row==0&&col!=0  || col==0&&row!=0&&row!=n-1 || col==n-1&& row>=n/2 || row==n-1&&col!=0 || row==n/2&&col>2 || col==n-6&&row==n/2)
				{
					System.out.print("G ");
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
