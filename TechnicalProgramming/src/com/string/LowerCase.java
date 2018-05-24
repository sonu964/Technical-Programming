package com.string;

import java.util.Scanner;

public class LowerCase
{
	public static String lowerCase(String str)
	{
		String res ="";
		//char ch=' ';
		for (int j = 0; j < str.length(); j++) 
		{
			 char  ch = str.charAt(j);
			if(ch>=65 && ch<=90)
			{
				 ch = (char) (ch+32);
			}
			 res =res+ch;
			
		}
		return res;	
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 =sc.nextLine();
		String res =lowerCase(s1);
		System.out.println(res);

	}

}
