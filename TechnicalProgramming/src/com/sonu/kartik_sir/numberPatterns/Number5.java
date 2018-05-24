package com.sonu.kartik_sir.numberPatterns;

public class Number5 {

	public static void main(String[] args)
	{
		int n=3;
		for (int row = 0; row < n-1; row++)
		{
			int count =1;
			for (int space = 0; space < n-1-row; space++)
			{
				System.out.print("  ");
			}
			for (int stars = 0; stars <=2*row; stars++) 
			{
				if(stars<row)
					System.out.print(count+++" ");
				else
					System.out.print(count--+" ");
			}
			
			System.out.println();
		}
		
		for (int row = n-1; row >=0; row--)
		{
			int count =1;
			for (int space = 0; space < n-1-row; space++)
			{
				System.out.print("  ");
			}
			for (int stars = 0; stars <=2*row; stars++) 
			{
				if(stars<row)
					System.out.print(count+++" ");
				else
					System.out.print(count--+" ");
			}
			
			System.out.println();
		}

	}

}
