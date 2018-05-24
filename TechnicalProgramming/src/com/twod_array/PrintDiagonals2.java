package com.twod_array;

public class PrintDiagonals2 {

	public static void main(String[] args) {

		int ar [] [] = {{1,6,7,9,8},
						{2,6,7,9,8},
						{3,6,7,9,8},
						{4,6,7,9,8},
						{5,6,7,9,8}};
		
		int m = ar.length - 1;
		int n = ar.length - 1;
		
		int i, j;
		
		for(int k = 0; k<m; k++){
			
			i = k;
			j = 0;
			
			int sum = 0;
			
			while(i>= 0){
				
				//System.out.println(ar[i][j]);
				sum = sum + ar[i][j];
				
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
			}
			System.out.println(sum);
		}
		
	}

}
