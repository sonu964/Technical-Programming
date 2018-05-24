package com.twod_array;

public class PrintDiagonals {

	public static void main(String[] args) {

		System.out.println("main started..........");
		int ar [][] = { {1,6,7,9,8},
						{2,6,7,9,8},
						{3,6,7,9,8},
						{4,6,7,9,8},
						{5,6,7,9,8}};
		
		int m = ar.length - 1;
		int n = ar.length - 1;
		
		int i, j;
		
		for(int k = 0; k<m; k++){
			System.out.println("1st for loop started..........");
			i = k;
			j = 0;
			
			int sum = 0;
			
			while(i>= 0){
				System.out.println("1st while loop started..........");
				//System.out.println(ar[i][j]);
				sum = sum + ar[i][j];
				
				i = i-1;
				j= j+1;
				
			}
			System.out.println(sum);
		}
		
		for(int k = 1; k < n; k++){
			
			i = m-1;
			j = k;
			int sum = 0;
			while(j<n){
				
				//System.out.println(ar[i][j]);
				sum = sum + ar[i][j];
				i = i-1;
				j= j+1;
			}
			System.out.println(sum);
		}
		
		System.out.println("main ended........");
		
	}

}
