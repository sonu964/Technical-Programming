package com.twod_array;

import java.util.Scanner;

public class AntiClockwiseSpiral {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows");
		int rows = sc.nextInt();
		System.out.println("Enter cols");
		int cols = sc .nextInt();
		
		int mat[][] = new int [rows][cols];
		
		System.out.println("Enter the integer to start the spiral");
		int count = sc.nextInt();
		for (int start = 0, end = mat.length-1; start < end; start++,end--) {
			
			
			for (int i = start; i < end; i++) {
				
				mat[start][i] = --count;
			}
			for (int i = start; i < end; i++) {
				
				mat[i][end] = --count;
			}
			for (int i = end; i > start; i--) {
				
				mat[end][i]= --count;
			}
			for (int i = end; i > start; i--) {
				
				mat[i][start] = --count;
			}
			
		}
		for (int i = 0; i < mat.length; i++) {
			
			for (int j = 0; j < mat[i].length; j++) {
				
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
