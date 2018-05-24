package com.string;

import java.util.Scanner;
//using recursion
public class Reverse 
{
	static String re="";
	public  static String rev(String s1,int len)
	{
		
		if(len>=0)
		{
			//char ch =s1.charAt(len--);
			//re =re+ch;
			re+=s1.charAt(len--);
			
			
			rev(s1,len);
		}
		return re;
				
		
		
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		String reverse =rev(str,str.length()-1);
		
		System.out.println("Reverse using recursion : "+reverse);

	}

}
