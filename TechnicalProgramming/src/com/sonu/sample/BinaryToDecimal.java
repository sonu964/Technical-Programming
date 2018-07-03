package com.sonu.sample;

import java.util.Scanner;

public class BinaryToDecimal {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("main method started..");
		System.out.println("Enter Binary number");
		
		int num = scan.nextInt();
		
		boolean checkBinary = isBinary(num);
		
		if( checkBinary )
		{
			int decimalNumber = binaryToDecimal(num);
			
			System.out.println("Decimal number of Binary "+num+" is "+decimalNumber);
		}
		else
		{
			System.out.println("Invalid Binary number !! Please enter valid Binary number..");
		}
		System.out.println("main method ended");
		
		
		scan.close();

	}
	private static int binaryToDecimal(int num) {

		int decimalNumber = 0, rem = 0, count = 0;
		
		while(num != 0)
		{
			rem = num % 10;
			decimalNumber = decimalNumber + rem * power(2,count++);
			num = num / 10;
		}
		
		return decimalNumber;
	}
	private static int power(int num, int pwr) {
		
		int res = 1;
		for (int j = 0; j < pwr; j++)
		{
		
			 res = res*num;
			
		}
		
		return res;
	}
	private static boolean isBinary(int num) {

		while(num > 0)
		{
			int rem = num % 10;
			
			if(rem > 1)
			{
				return false;
			}
			num = num / 10;
		}
		
		return true;
	}
	

	
}
