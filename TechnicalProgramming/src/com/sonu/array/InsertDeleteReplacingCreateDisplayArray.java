package com.sonu.array;

import java.util.Scanner;

public class InsertDeleteReplacingCreateDisplayArray 
{

	public static int[] createArray(int size, Scanner sc)
	{

		//Scanner sc = new Scanner(System.in);
		int ar[] = new int[size];
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("enter the value at "+i+" value ");
			ar[i] = sc.nextInt();
		}
		//sc.close();
		return ar;
	}


	public static int[] insrtElement(int ar[], int ele, int index)
	{
		if(index <= ar.length){

			int nar[] = new int[ar.length+1];
			nar[index]=ele;

			for (int i = 0; i < index; i++)
			{

				nar[i]=ar[i];

			}
			for (int i = index+1; i < nar.length; i++) {

				nar[i] = ar[i-1];

			}
			return nar;

		}else{

			System.out.println("Invalid index");

			return ar;
		}

	}


	public static int[] deleteElement(int ar[], int index)
	{

		if(index <= ar.length){

			int nar [] = new int [ar.length - 1];

			for (int i = 0; i < index; i++) {

				nar[i] = ar [i];

			}
			for (int i = index; i < nar.length; i++) {

				nar[i] = ar[i+1];
			}

			return nar;


		}else{

			System.out.println("Invalid index");

			return ar;
		}

	}

	public static int[] replaceElement(int ar[], int index, int ele)
	{

		ar[index]= ele;
		return ar;
	}




	public static void displayArray(int [] ar,Scanner sc)
	{
		//Scanner sc = new Scanner(System.in);

		System.out.println("array elements are ");
		for (int i = 0; i < ar.length; i++) 
		{

			System.out.println("ar["+i+"]= "+ ar[i]);

		}
		//sc.close();
	}


	public static void main(String[] args) 
	{
		System.out.println("main started........");
		int ar [] = null;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter 1 to create array ");
			System.out.println("Enter 2 to insert array ");
			System.out.println("Enter 3 to delete array ");
			System.out.println("Enter 4 to replace array ");
			System.out.println("Enter 5 to display array ");

			System.out.println("Enter your choice..");
			int choice = sc.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("Enter the size of array ");
				int size = sc.nextInt();
				ar =createArray(size,sc);
				break;

			case 2:
				System.out.println("Enter the element to be inserted in array ");
				int ele = sc.nextInt();
				System.out.println("Enter the index at which above element to be inserted ");
				int index = sc.nextInt();
				ar =insrtElement(ar, ele, index);

				break;

			case 3:
				System.out.println("Enter the index ");
				int index1 =sc.nextInt();
				ar =deleteElement(ar, index1);
				break;
			case 4:
				System.out.println("Enter the element");
				int ele2 = sc.nextInt();
				System.out.println("Enter the index");
				int indx2 =sc.nextInt();
				ar =replaceElement(ar, ele2, indx2);	
				break;
			case 5:
				displayArray(ar,sc);

				break;
			}
			
			System.out.println("do you wish to continue ");
			
			String str = sc.next();
			if(str.equalsIgnoreCase("no"))
			{
				break;
				//return;
			}

		}

	}
}