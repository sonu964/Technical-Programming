package com.string;

import java.util.Scanner;

public class Demo {
	
/*	static void swap(String str){
		
		String first = "";
		String last = "";
		
		char [] ch = str.toCharArray();
		int i = 0;
		for ( i = 0; i < ch.length;) {

			while(ch[i] != ' '){
				
				first = first + ch[i];
				i++;
			}
			
			break;
			
		}
		
		int j = 0;
		
		for( j = ch.length - 1; j>i; ){
			
			while( ch[j] != ' ' ){
				
				last = ch[j] + last;
				
				j--;
			}
			
			break;
		}
		System.out.print(last);
		
		for( int k = i; k <=j; k++){
			
			System.out.print(ch[k]);
		}
		System.out.println(first);
		
	}*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		
	/*	String str = sc.nextLine();
		swap(str);
*/
		char ch = 'b';
		switch(ch){
		
		case 'a':
		case 'b':
		case 'c': System.out.println("hi");
		default:System.out.println("hello");
		}
		
	}

}
