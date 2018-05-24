package com.string;

import java.util.Scanner;
/*
 Two string will be anagram to each other if and only they contain the same number of characters but order of
  characters doesn't matter.
 That is, If two string are anagram to each other then one string can be rearranged to form of other string
 e.g.:- Hitler Woman , Mother in law
 */
public class Anagarm 
{
	public static String remove(String s1)//first step
	{
		String res="";
		char ch[]=s1.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]!=' ')
			{
				res = res+ch[i];
			}
		
		}
		return res;
	}
	
	
	public static String toLowerCase(String s1)// second step
	{
		String res ="";
		char[] ch =s1.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				ch[i] = (char) (ch[i]+32);
			}
			res = res+ch[i];
		}
		return res;
	}
	
	public static String sort(String s1)//third step
	{
		String res="";
		char ch[]=s1.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			for (int j = i+1; j < ch.length; j++)
			{
				if(ch[i]>ch[j])
				{
					char c1 =ch[i];
					ch[i]=ch[j];
					ch[j]=c1;
				}
			}
			res= res+ch[i];
		
		}
		return res;
	}
	
	public static boolean compare(String s1, String s2)//4th step, we camparing to character for the same position so there is one for loop
	{
		char c1[] = s1.toCharArray();

		char c2[] = s2.toCharArray();
		
		for (int i = 0; i < c2.length; i++) 
		{
			if(c1[i]!=c2[i])
			{
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 =sc.nextLine();
		System.out.println("Enter the Second String");
		String s2 = sc.nextLine();
		System.out.println("s1= "+s1);
		System.out.println("s2= "+s2);
		
		
		 s1 =remove(s1);
		 s2 =remove(s2);
		 System.out.println("*******************************");
	
		 
		System.out.println("The String after removing the space");
		System.out.println("s1= "+s1);
		System.out.println("s2= "+s2);
		
		if(s1.length()==s2.length())
		{
			// logic for anagram
			s1=toLowerCase(s1);
			s2=toLowerCase(s2);
			
			System.out.println("*******************************");
			System.out.println("the string after converting ");
			System.out.println("s1= "+s1);
			System.out.println("s2= "+s2);
			
			s1=sort(s1);
			s2=sort(s2);
			
			System.out.println("*******************************");
			System.out.println("The string after sorting ");
			System.out.println("s1= "+s1);
			System.out.println("s2= "+s2);
			boolean res = compare(s1, s2);
			if(res)
			{
				
				System.out.println("String are anagram");
			}
			else
			{
				System.out.println("String are not anagaram");
			}
		}
		else//outer else
		{
			System.out.println("String are not anagram");
		}
	}
}
