package com.sonu.kartik_sir.alphabets;

public class Alphabet_J
{

	public static void main(String[] args)
	{
		int num=5;
		for (int i = 0; i < num; i++) 
		{
			for (int j = 0; j < num; j++) 
			{
				if(i==0 || j==num/2 && i!=num-1 || i==num-1 && j<num/2  || j==0 && i>num/2    )
				{
					System.out.print("J ");
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
