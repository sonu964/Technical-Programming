package com.string;

import java.util.Scanner;

public class SwapOfWordinString {
	
	protected static void swap(String str){
		
		String first = "";
		String last = "";
		int i = 0;
		for ( i = 0; i < str.length(); ) {
		
			while(str.charAt(i) != ' '){
				
				first = first + str.charAt(i);
				i++;
			}
			
			break;
			
		}
		int j = 0;
		for( j = str.length() -1; j>i;){
			
			while(str.charAt(j) !=' '){
				
				last = str.charAt(j) + last;
				
				j--;
			}
			break;
		}
		System.out.print(last);
		
		for( int m = j; m >= i; m-- ){
			
			System.out.print(str.charAt(m));
		}
		System.out.println(first);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = sc.nextLine();
		swap(str);
		sc.close();

	}

}
