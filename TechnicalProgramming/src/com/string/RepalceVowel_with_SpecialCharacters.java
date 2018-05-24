// replace vowels only with special characters
package com.string;

import java.util.Scanner;

// same as converting to hexadecimal
public class RepalceVowel_with_SpecialCharacters 
{
	
	public static String replcae(String s1)
	{
		//char ch[]=s1.toCharArray();
		String res="";
		
		for (int i = 0; i < s1.length(); i++)
		{
			switch (s1.charAt(i))
			{
			case 'a':res=res+" "+'$';
			break;
			case 'e':res=res+" "+'@';
			break;
			case 'i':res=res+" "+'%';
			break;
			case 'o':res=res+" "+'!';
			break;
			case 'u':res=res+" "+'^';
			break;
			

			default:res=res+" "+s1.charAt(i);   //+ch[i];
				break;
			}
		}
		return res;
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 =sc.nextLine();
		String res = replcae(s1);
		System.out.println(res);
		
	}

}
