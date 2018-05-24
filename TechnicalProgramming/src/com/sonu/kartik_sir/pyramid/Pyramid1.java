package com.sonu.kartik_sir.pyramid;

public class Pyramid1 {

	public static void main(String[] args)
	{
		int n=7;
		for (int row = 0; row < n; row++) 
		{
			for (int col = 0; row>=col; col++)
			{
				
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int row = n-2; row >=0; row--) 
		{
			for (int col = 0; col<n; col++)
			{
				if(row>=col)
				
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
