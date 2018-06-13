package com.sonu.sample;

import java.util.Scanner;

public class DecimalToHexaDecimal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Decimal number to convert into Hexa-Decimal number");
		
		int num = scan.nextInt();
		
		String hexaDecimalNumber = convertDecimalToHexaDecimal(num);
		
		System.out.println("Hexa decimal number of "+num+" is "+hexaDecimalNumber);
		
		scan.close();
	}

	private static String convertDecimalToHexaDecimal(int num) {

		String res ="";
		int r ;
		while(num > 0)
		{
			
			r = num % 16 ;
			
			switch(r)
			{
				case 10 : res = res + "A";
				break;
				case 11 : res = res + "B";
				break;
				case 12 : res = res + "C";
				break;
				case 13 : res = res + "D";
				break;
				case 14 : res = res + "E";
				break;
				case 15 : res = res + "F";
				break;
				default : res =  r + res;
			}
			num = num / 16;
			
		}
		return res;
		
	}

}
