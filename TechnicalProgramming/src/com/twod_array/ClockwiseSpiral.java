package com.twod_array;

import java.util.Scanner;

//Print a given matrix in spiral form
public class ClockwiseSpiral {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		System.out.println("Enter the cols");
		int cols = sc.nextInt();

		int mat[][] = new int [rows][cols];


		int count = 1;

		for (int start = 0, end = mat.length-1; start < end; start++,end--) {

			for (int i = start; i < end; i++) {

				mat[start][i] = count++;

			}
			for (int i = start; i < end; i++) {

				mat[i][end] = count++;

			}
			for (int i = end; i > start; i--) {

				mat[end][i] = count++;

			}
			for (int i = end; i > start; i--) {

				mat[i][start] = count++;

			}
		}
		/*if(mat.length % 2 != 0)
			mat[mat.length/2][mat.length/2] = count ++;
		*/
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();

		}


		sc.close();


	}

}
