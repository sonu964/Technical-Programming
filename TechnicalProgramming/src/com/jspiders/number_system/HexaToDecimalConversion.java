package com.jspiders.number_system;

import java.util.Scanner;

public class HexaToDecimalConversion 
{
	
	public static int power(int num,int pwr)
	{
		int res=1;
		for (int i = 0; i <=pwr; i++) 
		{
			res= res*num;
		}
		return res;
	}
	
	public static int hexToDecimal(String s1)
	{
		int c= s1.length()-1;
		int out=0;
		int count =0;
		
		
		while(c>0)
		{
			char ch = s1.charAt(c);
			if(ch>=65 && ch<=70)
			{
				out = out + (ch-55)*power(16, count++);
			}
			else if(ch>=97 && ch<=102)
			{
				out = out + (ch-87)*power(16, count++);
				
			}
			else if(ch>=48 && ch<=57)
			{
				out = out + (ch-48)*power(16, count++);
				
			}
			else
			{
				//System.out.println("Invalid character");
				return -1;
			}	
		}
		return out;
		
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number");
		String s1 = sc.next();
		


		int out = hexToDecimal(s1);
		System.out.println(out);
	
	}

}
