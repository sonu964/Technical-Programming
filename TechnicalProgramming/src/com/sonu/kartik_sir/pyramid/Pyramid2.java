package com.sonu.kartik_sir.pyramid;

public class Pyramid2 {

	public static void main(String[] args) 
	{
		int n=5;
		for (int row = 0; row <n; row++) 
		{
			for (int col = 0; col<n; col++)
			{
				if( row+col>=n-1  )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}	
				
			}
			System.out.println();
			
		}
		
		
		for (int row = 1; row <n; row++) 
		{
			for (int col = 0; col<n; col++)
			{
				if( row<=col  )
				{
					System.out.print("* ");
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