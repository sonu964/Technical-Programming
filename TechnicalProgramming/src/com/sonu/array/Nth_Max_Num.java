
package com.sonu.array;

import java.util.Scanner;

public class Nth_Max_Num 
{

	public static int[] sort(int []ar)
	{
		for (int i = 0; i < ar.length-1; i++)
		{
			for (int j = i+1; j < ar.length; j++)
			{
				if(ar[i]<ar[j])
				{
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar;
	}
	
	public static int max(int []ar, int n)
	{
		if(n<=0 && n>ar.length)
		{
			System.out.println("invalid position");
			return 0;
		}
		return ar[n-1];
	}
	
	public static int min(int []ar, int n)
	{
		if(n<=0 && n>ar.length)
		{
			System.out.println("invalid position");
			return 0;
		}
		
		return ar[ar.length-n];
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int ar[] = new int [size];
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("Enter the value at "+i+" value");
			ar[i]=sc.nextInt();
			
			
		}
		
		int ar1 [] = sort(ar);
		
		System.out.println("Enter the number which is  maximum ");
		int m = sc.nextInt();
		int m1=max(ar1, m);
		System.out.println("the "+m+"th maximum is "+m1);
		
		System.out.println("Enter the number which is minimum  ");
		int n = sc.nextInt();
		int m2=min(ar1, n);
		System.out.println("the "+n+"th minimum is "+m2);
		
	}

}

