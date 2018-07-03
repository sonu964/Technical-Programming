package com.string;

public class Sample {
	
	public static void main(String[] args) {
		 
		int ar [] = {10,12,13};
		
		for (int i = 0; i < ar.length-1; i++) {
			
			for (int j = ar[i]+1; j < ar[i+1]; j++) {
			
				System.out.println(j);
			}
			
		}
	}

}
