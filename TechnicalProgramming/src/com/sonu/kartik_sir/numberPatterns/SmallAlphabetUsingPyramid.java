package com.sonu.kartik_sir.numberPatterns;

public class SmallAlphabetUsingPyramid {

	public static void main(String[] args)
	{
		int n=3;
		for (int row = 0; row < n; row++)
		{
			char a=97;
			for (int space = 0; space < n-1-row; space++) 
			{
				System.out.print("  ");
			}
			for (int star = 0; star <=2*row; star++) 
			{
				System.out.print(a+++" ");
			}
			System.out.println();
		}

	}

}
