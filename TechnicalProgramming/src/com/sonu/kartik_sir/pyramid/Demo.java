package com.sonu.kartik_sir.pyramid;

public class Demo {

	public static void main(String[] args)
	{
		int n=3; 
		for(int row=0; row<n-1; row++)
		{
			for (int space = 0; space < n-1-row; space++)
			{
				System.out.print("  ");
			}
			for (int star = 0; star <= 2*row; star++)
			{
				if(star==0 || star==2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		for(int row=n-1; row>=0; row--)
		{
			for (int space = 0; space < n-1-row; space++)
			{
				System.out.print("  ");
			}
			for (int star = 0; star <= 2*row; star++)
			{
				if(star==0 || star==2*row)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
