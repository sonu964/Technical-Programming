package com.string;


import java.util.Scanner;

public class ConvertToInteger {

	public static int convert(String str)
	{
		int out=0;
		char [] ch =str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>=48&&ch[i]<=57)
			{
				out = out*10+(ch[i]-48);
			}
			else
			{
				System.out.println("Enter the valid integer string");
			}
			
			
			
		}
		return out;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String y =sc.next();
		int res=convert(y);
		System.out.println(res);		
		
		

	}

}
