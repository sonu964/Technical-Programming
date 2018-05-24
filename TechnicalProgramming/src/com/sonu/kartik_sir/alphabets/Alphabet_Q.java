package com.sonu.kartik_sir.alphabets;

public class Alphabet_Q {

	public static void main(String[] args)
	{
		int n = 9;
		for (int row = 0; row <n; row++) 
		{
			for (int col = 0; col <n; col++) 
			{
				if(row==0&&col<=3*n/4&&col!=0&&col!=3*n/4 || col==0&&row<3*n/4&&row!=0&&row!=0 || row==3*n/4&&col<=3*n/4&&col!=0 ||col==3*n/4&&row<=3*n/4&&row!=0 ||row==col&&col>=n/2)
				{
					System.out.print("p ");
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
