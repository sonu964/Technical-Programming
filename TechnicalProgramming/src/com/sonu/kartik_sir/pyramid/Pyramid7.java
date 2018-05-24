package com.sonu.kartik_sir.pyramid;

public class Pyramid7 {

	public static void main(String[] args) 
	{
		int n=3;
		for(int row=0; row<n;row++)
		{
			for(int sp =0; sp<n-1-row; sp++)
			{
				System.out.print("  ");
			}
			for (int star = 0; star <=2*row; star++)
			{
				if(star==0 || star==2*row)
				System.out.print("* ");
				else
				System.out.print("  ");	
			}
			System.out.println();
		}
		for(int row=n-2; row>=0;row--)
		{
			for(int sp =0; sp<n-1-row; sp++)
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
