package com.sonu.array;

import java.util.Scanner;

// delete the repeated element of given array
public class DeleteDuplicateElements
{
	public static int[] deleteElement(int ar[])
	{
		int size = ar.length;
		System.out.println("entering method");
		for (int i = 0; i < size-1; i++) 
		{
			
			for (int j = i+1; j <size; j++)
			{
				if(ar[i]==ar[j])
				{
					int k=j;
					while(k<size-1)
					{
						ar[k]=ar[k+1];
						k++;
					}
					j--;
					size--;
					
				}
			}
		}
		int nar[] = new int[size];
		for (int i = 0; i < size; i++)
		{
			nar[i]=ar[i];
		}
		
		return nar;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner  sc = new Scanner(System.in);
		System.out.println("Entr the size of array");
		int size = sc.nextInt();
		int ar[] = new int[size];
		for (int i = 0; i < ar.length; i++)
		{
			System.out.println("Enter the value at "+i+" value");
			ar[i]=sc.nextInt();
		}
		System.out.println("array elements before deleting");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("ar["+i+"]= " +ar[i]);
		}
		
		int nar[] = deleteElement(ar);
		
		System.out.println("array elements after deleting");
		for (int i = 0; i < nar.length; i++) 
		{
			System.out.println("nar["+i+"]=" +nar[i]);
		}

	}

}
