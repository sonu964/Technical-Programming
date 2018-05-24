package com.string;

import java.util.Scanner;

public class CountVowels {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		int res = count(s1);
		System.out.println(res);

	}
	
	public static int count(String s1){
		
		int count = 0;
		
		//for (int i = 0; i < s1.length(); i++) {
		for(char c : s1.toCharArray()){	
			//switch(s1.charAt(i)){
			switch(c){
			
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				count++;
			break;
			}
			
			
		}
		return count;
		
		
	}

}
