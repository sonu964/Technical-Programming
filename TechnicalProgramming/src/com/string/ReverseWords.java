package com.string;

import java.util.Scanner;

public class ReverseWords 
{
	public static String revEachWord(String str)
	{
		String s2="";// to concatenate the all word of statement
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			String res="";// to concatenate the each word
			while (i <ch.length && str.charAt(i)!=' ')
			{
				res = ch[i]+res;
				i++;// avoid the infinite loop and increment upto just before the space
				
				
			}
			s2= s2+" "+res;
			
		}
		return s2;
	}//check the space and reverse the each word
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		String s3=revEachWord(s1);
		System.out.println("the given string is "+s1);
		System.out.println("the reverse each word of string is "+s3);
		sc.close();
	}

}
/*
import java.util.Scanner;

public class A 
{
	static String res = "";
	public static String reverseEachWord(String s1)
	{
		String res = "";
		for (int i = 0; i < s1.length(); i++)
		{
			String s3 = "";
			while(i<s1.length() && s1.charAt(i)!=' ')
			{
				s3 = s1.charAt(i)+s3;
				i++;
			}
			res = res+" "+s3;
			
			
		}
		return res;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		s1 =reverseEachWord(s1);
		System.out.println(s1);
		sc.close();
		
	}

}
*/