package com.string;

import java.util.Scanner;

public class SumIntegerBetweenWord 
{

	public static String revEachWord(String str)
	{
		String s2="";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			int count =0;
			String res="";
			while (i <ch.length && str.charAt(i)!=' ')
			{
				count++;
				res = res+ch[i];
				i++;
				
			}
			s2= s2+ res+""+count+" ";
			//no need to take extra variable because we no interchanging the position of the word
		}
		return s2;
	}
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		String s3=revEachWord(s1);
		System.out.println("the given string is "+s1);
		System.out.println("the given string is "+s3);
		
		sc.close();
	}


}
