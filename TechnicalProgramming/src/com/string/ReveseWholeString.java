package com.string;

import java.util.Scanner;

public class ReveseWholeString {

	public static String revEachWord(String str)
	{
		String s2="";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			String res="";
			while (i <ch.length && str.charAt(i)!=' ')
			{
				res = ch[i]+res;
				i++;
				
			}
			s2= res+" "+s2;
			
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
		System.out.println("the given string is "+s3);
	}


}
