package com.sonu.kartik_sir.alphabets;

public class Alphabet_A {

	public static void main(String[] args) {
		int n =7;
		for (int row = 0; row < n; row++)
		{
			for (int col = 0; col <= n/2; col++) 
			{
				if(row==0 || col==n/2 || row ==n/2 ||col==0 )
				{
				System.out.print("A ");
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
