package com.sonu.array;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		int size = sc.nextInt();
		
		int ar [] = new int[size];
		
		for (int i = 0; i < ar.length; i++) {
			
			System.out.println("Enter the element at index "+i+" ");
			
			ar[i] = sc.nextInt();
			
		}
		
		removeRepeatedEle(ar);
		
	}

	private static void removeRepeatedEle(int[] ar) {

		int size = ar.length;
		for (int i = 0; i < size; i++) {
			
			for (int j = i+1; j < size;) {
				
				if(ar[i]==ar[j]){
					
					for (int k = j; k < size-1; k++) {
						
						ar[k] = ar[k+1];
						
					}
					size--;
					
				}else{
					j++;
				}
			}
			
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println(ar[i]);
			
		}
		
	}
}
