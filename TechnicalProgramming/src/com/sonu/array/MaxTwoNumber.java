package com.sonu.array;

import java.util.Scanner;

public class MaxTwoNumber 
{
	public static void maxNum( int ar [])
	{
		int max1 = ar[0];
		int max2 =ar[1];
		int i1=0;
		int i2=1;
		
		for (int i = 0; i < ar.length; i++)
		{
			if(max1<ar[i])
			{
				max2=max1;
				max1=ar[i];
				i2=i1;
				i1=i;
			}
			else if (max2<ar[i])
			{
				max2=ar[i];
				i2=i;
			}
		}
		System.out.println("max1  and max2 = "+max1+" "+max2);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int ar[] = new int [size];
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("enter the value at "+i+" value at index "+i);
			ar[i]=sc.nextInt();
			
		}
		maxNum(ar);

	}

}
