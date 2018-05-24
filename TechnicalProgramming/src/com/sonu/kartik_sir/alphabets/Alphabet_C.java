package com.sonu.kartik_sir.alphabets;

public class Alphabet_C {

	public static void main(String[] args)
	{

		int n = 5;
		for (int row = 0; row <n; row++) 
		{
			for (int col = 0; col <n; col++) 
			{
				if(row==0&&col!=0 ||col==0&&row<n/2&&row!=0 || row==n/2&&col!=0)
				{
					System.out.print("C ");
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
