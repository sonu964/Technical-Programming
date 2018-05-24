package com.twod_array;

import java.util.Scanner;

public class Demo {
	
	public static int [][] transpose(int ar [][]){
		
		int row = ar.length;
		int col = ar[0].length;
		
		int nar [] [] = new int [row][col];
		
		for (int i = 0; i < nar.length; i++) {
			
			for (int j = 0; j < nar[i].length; j++) {
				
				nar[i][j] = ar[j][i];
				
			}
		}
		
		return nar;
	}
	
	
	public static int [][] swaprows(int [][]ar){
		
		for(int i = 0; i < ar.length/2; i++){
			
			for(int j = 0; j < ar[i].length; j++){
				
				int temp = ar[i][j];
				ar[i][j] = ar[ar.length - 1 - i][j];
				ar[ar.length - 1 - i][j] = temp;
			}
		}
		
		return ar;
	}
	
	public static int [][] swapcols(int ar [][]){
		
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = 0; j < ar[i].length/2; j++) {
				
				int temp = ar[i][j];
				ar[i][j] = ar[i][ar[i].length - 1 -j];
				ar[i][ar[i].length - 1 -j] = temp;
				
			}
			
		}
		
		return ar;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter no. of columns");
		int columns = sc.nextInt();
		
		int ar [][] = new int[rows][columns];
		
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = 0; j < ar[i].length; j++) {
				System.out.println("Enter the value at "+i+"row and "+j+" th column ");
				ar[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Given matrix is............");
		 
		 for (int i = 0; i < ar.length; i++) {
			 
			 for (int j = 0; j < ar[i].length; j++) {
				
				 System.out.print(ar[i][j]+" ");
			}
			 System.out.println();
			
		}
		
		
		/* ar = transpose(ar);
		 
		 System.out.println("After the transpose, matrix is............");
		 
		 for (int i = 0; i < ar.length; i++) {
			 
			 for (int j = 0; j < ar[i].length; j++) {
				
				 System.out.print(ar[i][j]+" ");
			}
			 System.out.println();	
		}*/
		
		 
		 
		/* //rotate 90 degree left
		int nar [][] = transpose(ar);
		int nar1 [][] = swaprows(nar);
		 
		 System.out.println("After rotating 90 degree left matrix............");
		 
		 for (int i = 0; i < nar1.length; i++) {
			 
			 for (int j = 0; j < nar1[i].length; j++) {
				
				 System.out.print(nar1[i][j]+" ");
			}
			 System.out.println();	
		}*/
		 
		 
		 /*//rotate 90 degree right
			int nar [][] = transpose(ar);
			int nar1 [][] = swapcols(nar);
			 
			 System.out.println("After rotating 90 degree right matrix............");
			 
			 for (int i = 0; i < nar1.length; i++) {
				 
				 for (int j = 0; j < nar1[i].length; j++) {
					
					 System.out.print(nar1[i][j]+" ");
				}
				 System.out.println();	
			}*/
		
		 
		 
		 
		 //rotate the matrix 180 degrees
		int n[] [] = transpose(ar);
		int nar [][] =  swapcols(n);
		int nar1 [][] = swaprows(nar);
		
		 System.out.println("After rotating 180 degree  matrix............");
		for (int i = 0; i < nar1.length; i++) {
			
			for (int j = 0; j < nar1[i].length; j++) {
				
				System.out.print(nar1[i][j]+" ");
			}
			System.out.println();
		}
		 
		

	}

}
