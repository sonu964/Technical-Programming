package com.string;

import java.util.Scanner;

public class CountDigitLowerUpperCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
count(str);
	}

	public static void count(String s1){
		
		int c_digit =0; int c_lower=0; int c_upper =0; int c_alpha=0;
		
		for (int i = 0; i < s1.length(); i++) {
		
			if(Character.isDigit(s1.charAt(i))){
				c_digit++;
			}
			
			else if(Character.isLowerCase(s1.charAt(i))){
				c_lower++;
			}
			else if(Character.isUpperCase(s1.charAt(i))){
				c_upper++;
			}
			else if(Character.isAlphabetic(s1.charAt(i))){
				c_alpha++;
			}
		}
		
		System.out.println("No. of digit "+c_digit);
		System.out.println("No. of Lower Case "+c_lower);
		System.out.println("No. of Upper Case "+c_upper);
		System.out.println("No. of Alphabet "+c_alpha);
	}
}
