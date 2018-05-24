package com.sonu.kartik_sir.numberPatterns;

public class Number4 {

	public static void main(String[] args) 
	{

		int p=1;
		int n=4;
		for (int i = n; i >= 1; i--)
		{
			
			for (int j = 1; j <= i; j++) 
			{
				if(i==1)
				{
					System.out.print("  ");
				}
				
				
					System.out.print(p++ +" ");	
					System.out.print(" ");
					
					
				
			}		
			
			System.out.println();
			System.out.print("  ");
			if(i==3)
			{
				System.out.print(" ");
			}
			
			
		}

	}

}
