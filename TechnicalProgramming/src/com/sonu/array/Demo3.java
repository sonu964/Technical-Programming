package com.sonu.array;

import java.util.Scanner;

public class Demo3 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int ar[] = new int [size];
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.println("Enter the value at "+i+" value");
			ar[i]=sc.nextInt();


		}
		ar = sort(ar);
		
		System.out.println("Enter order of element for maximum element");
		int m = sc.nextInt();
		
		int maxEle = max(ar,m);
		System.out.println(" "+m+"th maximum is "+maxEle);
		
		
		
		System.out.println("Enter order of element for minimum element");
		int n = sc.nextInt();
		
		int minEle = min(ar,n);
		System.out.println(" "+n+"th maximum is "+minEle);
	}

	private static int min(int[] ar, int n) {

		if(n<=0 && n>ar.length){
			
			System.out.println("Invalid index");
			return 0;
		}
		return ar[ar.length - n];
		
	}

	private static int  max(int[] ar, int m) {

		if(m<=0 && m> ar.length){
			
			System.out.println("Invalid index");
			
			return 0;
		}
		return ar[m-1];
			
			
		
	}

	private static int [] sort(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			
			for (int j = i+1; j < ar.length; j++) {
				
				if(ar[i] > ar[j]){
					
					int t = ar[i];
					ar[i] = ar[j];
					ar[j] = t;
				}
				
			}
			
		}
		return ar;
		
		
	}
	
	

}
