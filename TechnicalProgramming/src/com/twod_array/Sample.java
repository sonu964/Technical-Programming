package com.twod_array;

import java.util.Scanner;

public class Sample {
	
	
	public static int [][] transpose(int ar [][]){
		
		int oal = ar.length;
		int ial = ar[0].length;
		
		int nar [][] = new int [oal][ial];
		
		for (int i = 0; i < nar.length; i++) {
			
			for (int j = 0; j < nar[i].length; j++) {
				
				nar[i][j] = ar[j][i];
				
			}
			
		}
		
		return nar;
		
	}
	
	
	public static int [][] swaprows(int ar [][]){
		
		for (int i = 0; i < ar.length/2; i++) {
			
			for (int j = 0; j < ar[i].length; j++) {
				
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
				ar[i][j] = ar[i][ar.length - 1 - j];
				ar[i][ar.length - 1 - j] = temp;
				
			}
			
		}
		
		return ar;
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the outer array length");
		int oal = sc.nextInt();
		
		System.out.println("Enter the inner array length");
		int ial = sc.nextInt();
		
		int ar[] [] = new int[oal][ial];
		
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = 0; j < ar[i].length; j++) {
				
				System.out.println("Enter the array element at "+i+"th rows and "+j+"th column ");
				
				ar[i][j] = sc.nextInt();
				
			}
			
		}
		
		System.out.println("Given matrix is ......");
		
			for (int i = 0; i < ar.length; i++) {
						
				for (int j = 0; j < ar[i].length; j++) {
							
					System.out.print(ar[i][j]+" ");
							
				}
				System.out.println();
		}
		
		/*	
			ar = transpose(ar);
			System.out.println("Transpose matrix of given matrix");
			for (int i = 0; i < ar.length; i++) {
				
				for (int j = 0; j < ar[i].length; j++) {
					
					System.out.print(ar[i][j]+" ");
					
				}
				
				System.out.println();	
			}*/
			
			
			
			/*// Rotate 90 degree left
			
			ar = transpose(ar);
			int nar[][] = swaprows(ar);
			
			System.out.println("Rotate 90 degree left");
			
			for (int i = 0; i < nar.length; i++) {
				
				for (int j = 0; j < nar[i].length; j++) {
					
					System.out.print(nar[i][j]+" ");
					
				}
				
				System.out.println();	
			
			}*/
			
			
			
			
			/*// Rotate 90 degree right
			
						ar = transpose(ar);
						int nar[][] = swapcols(ar);
						
						System.out.println("Rotate 90 degree right");
						
						for (int i = 0; i < nar.length; i++) {
							
							for (int j = 0; j < nar[i].length; j++) {
								
								System.out.print(nar[i][j]+" ");
								
							}
							
							System.out.println();	
						
						}*/
			
			
			
			// Rotate 180 degree 
			
			ar = transpose(ar);
			int nar[][] = swapcols(ar);
			int nar1 [][] = swaprows(nar);
			
			System.out.println("Rotate 90 degree right");
			
			for (int i = 0; i < nar1.length; i++) {
				
				for (int j = 0; j < nar1[i].length; j++) {
					
					System.out.print(nar[i][j]+" ");
					
				}
				
				System.out.println();	
			
			}
			
		
		sc.close();

	}

}
