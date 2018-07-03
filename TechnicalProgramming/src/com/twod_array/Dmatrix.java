package com.twod_array;

import java.util.Scanner;

//Write a program to print the diagonal elements of 3X3 matrix .
class Dmatrix
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows");
		int rows = sc.nextInt();
		System.out.println("Enter cols");
		int cols = sc .nextInt();

		int mat[][] = new int [rows][cols];

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.println("Enter element at "+i+"th rows and "+j+"th column ");

				mat[i][j] = sc.nextInt();

			}

		}

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.print(mat[i][j]+" ");

			}
			System.out.println();

		}

		/*int a[][]= new int[3][3];
		int i,j,k=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
				a[i][j]=k;
				k++;
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("  " +a[i][j]);

			}
			System.out.println("\n");
		}*/
		System.out.println("digonal elments are ");
		/*for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(i!=j)
					System.out.print(" ");
				else
					System.out.println("  "+mat[i][j]);
			}
		}*/

		int sum = 0;

		for(int i=0;i<cols;i++)
		{
			System.out.print("  "+mat[i][i]);
			
			sum = sum + mat[i][i];
			
		}
		System.out.println();
		System.out.println(sum);
		
		
		sum = 0;
		for(int i=0;i<cols;i++)
		{
			System.out.print("  "+mat[cols-1-i][i]);
			
			sum = sum + mat[cols-1-i][i];

		}
		System.out.println();
		System.out.println(sum);
	}
}