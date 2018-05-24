package com.sonu.kartik_sir.numberPatterns;

public class Number6 {

	public static void main(String[] args) 
	{
		int n=10;
		int count=1;
		for (int row = 0; row <n; row++)
		{
			for (int col = 0; col <=row; col++)
			{
				System.out.print(count--+" ");
			}
			System.out.println();
			count=count+2*row+3;
		}

	}

}
