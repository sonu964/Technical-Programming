package com.twod_array;

import java.util.Scanner;

public class TransposeArray 
{

	
	 public static int [][] transpose(int [][] ar)
	{
		int row = ar.length;
		int col = ar[0].length;
		int nar[][] = new int[row][col];
		for (int i = 0; i < nar.length; i++) 
		{
			for (int j = 0; j < nar[i].length; j++) 
			{
				nar[i][j]= ar[j][i];
			}
		}
		return nar;
	}
	
	
	
	public static int[][] swaprows(int [][] ar)
	{
		for (int i = 0; i < ar.length/2; i++) // to prevent the re-initialization divide by 2
		{
			for (int j = 0; j < ar[i].length; j++)
			{
				int temp = ar[i][j];
				ar[i][j] = ar[ar.length-1-i][j];
				ar[ar.length-1-i][j]=temp;;
			}
		}
		return ar;
	}
	
	
	public static int[][] swapcol(int [][] ar)
	{
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar[i].length/2; j++)// to prevent the re-initialization divide by 2
			{
				int temp = ar[i][j];
				ar[i][j] = ar[i][ar[i].length-1-j];
				 ar[i][ar[i].length-1-j]=temp;
			}
		}
		return ar;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows ");
		int row=sc.nextInt();
		
		System.out.println("enter the col ");
		int col=sc.nextInt();
		
		int ar [][] = new int[row][col];
		
		for (int i = 0; i < ar.length; i++)
		{
			for (int j = 0; j < ar[i].length; j++)
			{
				System.out.println("Enter the value at " + i + " th row and " +j+"th column");
				ar[i][j]=sc.nextInt();
			}
		}
		
		//print the given matrix
		
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = 0; j < ar[i].length; j++) {
				
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		
		
		
		int transpose [][]=transpose(ar);
		
		System.out.println("Transpose matrix of given matrix ");
		for (int i = 0; i < transpose.length; i++) 
		{
			for (int j = 0; j < transpose[i].length; j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		// rotate 90 degree left means anti-clockwise
		int nar [][]= transpose(ar);
		int nar1 [][]= swaprows(nar);
		System.out.println("Rotate 90 degree left of the array elements...");
		for (int i = 0; i < nar1.length; i++) 
		{
			for (int j = 0; j < nar1[i].length; j++)
			{
				System.out.print(nar1[i][j]+" ");
			}
			System.out.println();
		}
	
		
		
		
		
		
		
		
		
		/*// rotate 90 degree right means clockwise
				int nar2 [][]= transpose(ar);
				int nar3 [][]= swapcol(nar2);
				System.out.println("the array element after swapping");
				for (int i = 0; i < nar3.length; i++) 
				{
					for (int j = 0; j < nar3[i].length; j++)
					{
						System.out.print(nar3[i][j]+" ");
					}
					System.out.println();
				}
				
		*/
		
		/*
				// rotate 180 degree 
				int nar4 [][]= swapcol(ar);
				int nar5 [][]= swaprows(nar4);
			
				System.out.println("the array element after swapping 180 degree");
				for (int i = 0; i < nar5.length; i++) 
				{
					for (int j = 0; j < nar5[i].length; j++)
					{
						System.out.print(nar5[i][j]+" ");
					}
					System.out.println();
				}*/
		sc.close();
		
		
	}

}
