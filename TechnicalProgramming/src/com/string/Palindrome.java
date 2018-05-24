package com.string;

import java.util.Scanner;
/* A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as forward, 
 * such as madam or “taco cat” or racecar or "nurses run".
 */
 
public class Palindrome 
{
	public static boolean  poly(String s1)
	{
		char [] ch = s1.toCharArray(); 
		for (int i = 0; i < ch.length/2; i++)
		{
			if(ch[i]!=ch[s1.length()-1-i])
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		boolean res=poly(str);
		if(res)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");

	}

}
