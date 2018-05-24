package com.twod_array;

import java.util.Scanner;

public class Sum
{
	public static void biggestle(int ar[][])
	{
		for (int i = 0; i < ar.length; i++)
		{
			int max= ar[i][0];
			for (int j = 0; j < ar[i].length; j++) 
			{
				if(ar[i][j]>max)
				{
					max=ar[i][j];
				}
				
			}
			System.out.println("Enter the value at "+i+" row is = "+max);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the outer  array size ");
		int out=sc.nextInt();
		
		System.out.println("enter the inner  array size ");
		int in=sc.nextInt();
		
		int ar [][] = new int[out][in];
		
		for (int i = 0; i < ar.length; i++)
		{
			for (int j = 0; j < ar.length; j++)
			{
				System.out.println("Enter the value at "+i+" row and "+j+"");
				ar[i][j]=sc.nextInt();
			}
		}
		biggestle(ar);

	}

}
