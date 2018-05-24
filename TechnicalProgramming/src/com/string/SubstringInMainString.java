package com.string;

import java.util.Scanner;

public class SubstringInMainString {
	
	private static void subString(String str1, String str2){
		
		char [] ch1 = str1.toCharArray();
		char [] ch2 = str2.toCharArray();
		int j;
		/*for (int i = 0; i < ch1.length; i++) {
			
			 j = 0;
			
			while(ch1[i] == ch2[j]){
				
				i++;
				j++;
			}
			if(ch2.length == j)
				return 1;
			else
				return -1;
	
		}
		
		*/
		
		for (int i = 0; i < ch1.length; i++) {
			
			for (int k = 0; k < ch2.length; k++) {
				
				if(ch1[i]==ch2[k] && ch1[i]!= ' '){
					
					k++;
					System.out.println(i);
					System.out.println(k);
				}
				
			}
			
		}
		
		
		
			
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter main string");
		String str1 = sc.nextLine();
		System.out.println("Enter substring string");
		String str2 = sc.nextLine();
		sc.close();
		subString(str1, str2);
		/*if(res == 1)
			System.out.println(str2);
		else
			System.out.println(res);*/
		

	}

}
