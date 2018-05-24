package com.sonu.array;

import java.util.Scanner;

public class Consecutive_Sum {
	
	public static int bigConSum(int ar[])
	{
		int cmax =ar[0]+ar[1];
		for (int i = 1; i < ar.length-1; i++)
		{
			if(cmax<ar[i]+ar[i+1])
			{
				cmax=ar[i]+ar[i+1];
			}
		}
		return cmax;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = sc.nextInt();
		int [] ar = new int [size];
		
		for(int i =0; i<size; i++){
			
			System.out.println("enter the values at index "+i+" ");
			ar[i] = sc.nextInt();
		}
		for (int j = 0; j < ar.length; j++) {
			
			System.out.println("ar["+j+"] = "+ar[j]);
		}
		
		int sum =bigConSum(ar);
		System.out.println(sum);
		
		
		

	}

}
