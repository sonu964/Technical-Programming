package com.sonu.array;

import java.util.Scanner;
// find the max values present in the arrays with index
public class MaxValue
{
	public static String firstMax(int [] ar)
	{
		int max = ar[0];
		int index =0;
		
		for (int i = 1; i < ar.length; i++) 
		{
			if(max<ar[i])
			{
				max = ar[i];
				index=i;
			}
			
		}
		String s1 = "the maximum element is "+max;
		String s2 = " and present  at"+index;
		return s1 + s2;
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
		String res=firstMax(ar);
		System.out.println(res);
		
		sc.close();
	}

}
