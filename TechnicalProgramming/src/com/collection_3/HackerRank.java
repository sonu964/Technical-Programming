package com.collection_3;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerRank 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of lines");
		int noOfLine = sc.nextInt();
		
		ArrayList mainList = new ArrayList();// to store the different arrayList
		
		for (int j = 0; j < noOfLine; j++) 	
		{
			ArrayList list1 = new ArrayList();
			
			System.out.println("Enter the value of d ");
			int d = sc.nextInt();
			for (int i = 0; i < d; i++)
			{
				list1.add(sc.nextInt());
			}
			mainList.add(list1);// complete the all arraylist			
		}
		System.out.println("Enter the value of q ");
		int q = sc.nextInt();
		
		for (int i = 0; i < q; i++) 
		{
			int x=sc.nextInt()-1;// for index value start from zero so do -1
			int y =sc.nextInt()-1;
			ArrayList l2 = (ArrayList) mainList.get(x);//
			if(y>l2.size())
			{
				System.out.println("ERROR!");
			}
			else//if there is element then execute else part
			{
				System.out.println(l2.get(y));
			}
		
			
		}
		
		

	}

}
