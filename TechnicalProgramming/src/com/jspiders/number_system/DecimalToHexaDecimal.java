package com.jspiders.number_system;

import java.util.Scanner;

public class DecimalToHexaDecimal 
{
	public static String decimalToHexa(int num)
	{
		String res = "";
		while(num>0)
		{
			int rem = num%16 ;
			switch(rem)
			{
			case 10: res ='A'+res;
					break;
			case 11: res ='B'+res;
					break;
			case 12: res ='C'+res;
					break;
			case 13: res ='D'+res;
					break;
			case 14: res ='E'+res;
					break;
			case 15: res ='F'+res;
					break;
			default:res = rem+res;

			}
			num = num/16;
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		String hexaValue = decimalToHexa(num);
		System.out.println("Hexa value "+num+" is : "+ hexaValue);
		
		sc.close();

	}

}
