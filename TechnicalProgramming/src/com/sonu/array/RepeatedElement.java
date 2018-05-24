package com.sonu.array;

import java.util.Scanner;

public class RepeatedElement {

	public static void deleteElement(int ar[])
	{
		int size = ar.length;
		System.out.println("entering method");
		for (int i = 0; i < size-1; i++) 
		{
			//int count=1;
			int count = 0;
			for (int j = i+1; j <size; j++)
			{
				
				
				if(ar[i]==ar[j])
				{
					count++;
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
			System.out.println(ar[i]+" is repeated "+count);
			//System.out.println(ar[i]+" is occuring "+count);
			count = 0;
			
		}
		/*int nar[] = new int[size];
		for (int i = 0; i < size; i++)
		{
			nar[i]=ar[i];
		}
		
		return nar;*/
	}
	
	
	public static void main(String[] args) 
	{

		Scanner  sc = new Scanner(System.in);
		System.out.println("Entr the size");
		int size = sc.nextInt();
		int ar[] = new int[size];
		for (int i = 0; i < ar.length; i++)
		{
			System.out.println("Enter the value at "+i+"value");
			ar[i]=sc.nextInt();
		}
		/*System.out.println("array elements before deleting");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("ar["+i+"]=" +ar[i]);
		}*/
		
		 deleteElement(ar);
		
		/*System.out.println("array elements after deleting");
		for (int i = 0; i < nar.length; i++) 
		{
			System.out.println("nar["+i+"]=" +nar[i]);
		}*/

	}


}
