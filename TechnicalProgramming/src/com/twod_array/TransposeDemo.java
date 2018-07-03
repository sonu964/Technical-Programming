package com.twod_array;

import java.util.Scanner;

public class TransposeDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = sc.nextInt();

		System.out.println("Enter the cols");
		int cols = sc.nextInt();

		int mat[][] = new int [rows][cols];

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.println("Enter the element at "+i+"th row and "+j+"th column ");

				mat[i][j] = sc.nextInt();

			}

		}
		
		//given matrix
		System.out.println("Given matrix..");
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.print(mat[i][j]+" ");

			}
			System.out.println();

		}
		
		int transpose[][] = transpose(mat);
		System.out.println("Transpose matrix..");
		for (int i = 0; i < transpose.length; i++) {

			for (int j = 0; j < transpose[i].length; j++) {

				System.out.print(transpose[i][j]+" ");

			}
			System.out.println();

		}
		
		// 90 degree left means anti-clockwise
		
		int trans[][] = transpose(mat);
		int nar [][] = swapRows(trans);
		
		System.out.println("90 degree left");
		for (int i = 0; i < nar.length; i++) {
			
			for (int j = 0; j < nar[i].length; j++) {
				
				System.out.print(nar[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int nar2[][] = transpose(mat);
		int nar3[][] = swapCols(nar2);
		
		System.out.println("90 degree clockwise");
		for (int i = 0; i < nar3.length; i++) {
			
			for (int j = 0; j < nar3[i].length; j++) {
				
				System.out.print(nar3[i][j]+" ");
			}
			System.out.println();
		}
		
		int nar4 [][] = swapCols(mat);
		int nar5 [][] = swapRows(nar4);
		System.out.println("180 degree rotation");
		
		for (int i = 0; i < nar5.length; i++) {
		
			for (int j = 0; j < nar5[i].length; j++) {
				
				System.out.print(nar5[i][j]+" ");
			}
			System.out.println();
		}


	}// End of main method
	
	

	private static int [][] transpose(int[][] mat) {

		int rows = mat.length;
		int cols = mat[0].length;
		int nar [][] = new int [rows][cols];
		
		for (int i = 0; i < mat.length; i++) {
			
			for (int j = 0; j < mat[i].length; j++) {
				
				nar[i][j] = mat[j][i];
			}
			
		}
		return nar;
		
	}
	
	public static int [][] swapRows(int mat [][]){
		
		for (int i = 0; i < mat.length/2; i++) {
			
			for (int j = 0; j < mat[i].length; j++) {
				
				int temp = mat[i][j];
				mat[i][j] = mat[mat.length-1-i][j];
				mat[mat.length-1-i][j] = temp;
			}
			
		}
		return mat;
	}
	
	public static int[][] swapCols(int mat [][]){
		
		for (int i = 0; i < mat.length; i++) {
			
			for (int j = 0; j < mat[i].length/2; j++) {
				
				int temp = mat[i][j];
				mat[i][j] = mat[i][mat[i].length-1-j];
				mat[i][mat[i].length-1-j] = temp;
			}
			
		}
		
		return mat;
	}

}
