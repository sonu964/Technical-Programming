package com.string;

import java.util.Scanner;

public class CountWord
{
	public static int count(String s1)
	{
		if(s1.length()>0)
		{
			char [] ch =s1.toCharArray();
			int count;
			if(ch[0]!=' ')
				
				count=1;
			else
				count=0;
			
			for (int i = 0; i < ch.length-1; i++) // avoid space at last
			{
				{
					if(ch[i]==' '&& ch[i+1]!=' ')
					count++;
				}
			}
			return count;
		}
		else
		{
			return 0;
		}
	}

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int c1 =count(str);
		System.out.println("the no. of word is = "+c1);
	

	}

}
