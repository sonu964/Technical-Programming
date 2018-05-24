package com.sonu.array;

import java.util.Scanner;
	


public class InsertElement 
{
	public static int[] insrtElement(int ar[], int ele, int index)
	{
		int nar[] = new int[ar.length+1];
		nar[index]=ele;
		for (int i = 0; i < nar.length; i++)
		{
			if(i<index)
			{
				nar[i]=ar[i];
			}
			else if(i>index)
			{
				nar[i]= ar[i-1];
			}
			
		}
		return nar;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int ar[] = new int [size];
		for (int i = 0; i < args.length; i++) 
		{
			System.out.println("Enter the value at "+i+ " value");
			ar[i]= sc.nextInt();
		}
		System.out.println("enter the element to insert");
		int ele = sc.nextInt();
		
		System.out.println("enter the index");
		int index=sc.nextInt();
		
		System.out.println("Array element before modifying");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("ar["+i+"]= "+ ar[i]);
		}
		int nar[] = insrtElement(ar, ele, index);
		for (int i = 0; i < nar.length; i++) 
		{
			System.out.println("nar["+i+"]= "+ nar[i]);
		}
		
	}

}
