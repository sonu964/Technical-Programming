package com.sonu.kartik_sir.alphabets;

public class Alphabet_D {

	public static void main(String[] args) 
	{

		int n = 11;
		for (int row = 0; row <n; row++) 
		{
			for (int col = n/2; col <n; col++) 
			{
				if(row==0&&col!=n-1 || col==n-1&&row<n/2&&row!=0 || row==n/2&&col!=n-1 || col==n/2&&row<n/2)
				{
					System.out.print("D ");
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
