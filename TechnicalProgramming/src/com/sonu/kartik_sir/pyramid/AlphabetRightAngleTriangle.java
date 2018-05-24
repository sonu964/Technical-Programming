package com.sonu.kartik_sir.pyramid;

public class AlphabetRightAngleTriangle {

	public static void main(String[] args) 
	{

		int n=4;
		for (int row = 0; row < n; row++)
		{
			char a=65;
			for (int space = 0; space <n-1-row; space++) 
			{
				System.out.print("  ");
			}
			for (int star = row; star >=0; star--) 
			{
				
					if(row==0)
						System.out.print(a+" ");
					else if(row==2)
					{

						System.out.print((char)(a+5) +" ");
						a--;
					}
					else if(row==3)
					{

						System.out.print((char)(a+9) +" ");
						a--;
					}
					else
					{
						System.out.print((char)(a+2) +" ");
						a--;
					}
			}
			
			System.out.println();
			
		}

	}

}
