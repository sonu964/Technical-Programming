package com.string;

import java.util.Scanner;

public class Count_AlphabetNumericSpecial_chars
{

	public static void count(String s1)
	{
		int countAlpha=0;
			
			
			for (int i = 0; i < s1.length(); i++) // avoid space at last
			{
				if(s1.charAt(i)>=65 && s1.charAt(i)<=90 || s1.charAt(i)>=97 && s1.charAt(i)<=122)
				 countAlpha++;	
			}
			System.out.println("the no. of Alphabet is = "+countAlpha);
	
	}
	public static void countNum(String s1)
	{
			int countNume=0;
			
			for (int i = 0; i < s1.length(); i++) // avoid space at last
			{
				if(s1.charAt(i)>=48 && s1.charAt(i)<=57)
				
					countNume++;	
			}
			System.out.println("the no. of Numeric is = "+countNume);
	
	}
	
	public static void countSpe(String s1)
	{
			int countS=0;
			
			for (int i = 0; i < s1.length(); i++) // avoid space at last
			{
				if(s1.charAt(i)>=32 && s1.charAt(i)<=47 || (s1.charAt(i)>=58 
					&& s1.charAt(i)<=64) )
					countS++;	
			}
			System.out.println("the no. of Special characters is = "+countS);
	
	}
	

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		count(str);
		countNum(str);
		countSpe(str);
		
	

	}

}
