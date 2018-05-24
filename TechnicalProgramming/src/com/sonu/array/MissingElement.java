package com.sonu.array;

import java.util.Scanner;
// program for print the missing element of the array
public class MissingElement {
	
	public static void missingnum(int [] ar)
	{
		for (int i = 0; i < ar.length-1; i++)
		{
			for (int j = ar[i]+1; j < ar[i+1]; j++){
				System.out.print(j+" ");
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int ar[] = {12,17,19,25};
		missingnum(ar);
		sc.close();
	}

}
