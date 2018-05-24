package com.string;

import java.util.Scanner;

public class Substring
{
	public static String sub(String s1, int start, int end)
	{
		String res="";
		char [] ch = s1.toCharArray();
		for (int i = start; i < end; i++)
		{
			res = res + ch[i];
		}
		return res;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String y =sc.next();
		System.out.println("Enter the start position of substring");
		int p =sc.nextInt();
		System.out.println("Enter the end position of substring");
		int q = sc.nextInt();
		
		String res=sub(y,p,q);
		System.out.println("subString("+p+","+q+") = " +res);	

	}

}
/*
 public class A 
{
	public static String subString(String s1, int start, int end)
	{
		String res = "";
		for (int i = start; i < end; i++) 
		{
			res =res+s1.charAt(i);
		}
		return res;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.next();
		System.out.println("Enter the initial index");
		int start = sc.nextInt();
		System.out.println("Enter the end index");
		int end = sc.nextInt();
		 s1 = subString(s1, start, end);
		 System.out.println("subString("+start+","+end+") = " +s1);
		
		
	}

}

 */
