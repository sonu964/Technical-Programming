package com.jspiders.number_system;

import java.util.Scanner;

public class DecimalToOctal 
{
	public static String decimalToOctal(int num)
	{
		String rem="";
		while(num>0)
		{
			rem = num%8 +rem;
			num = num/8;
		}
		return rem;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		String octalValue = decimalToOctal(num);
		System.out.println("Octal Value of "+num+" is "+octalValue);

	}

}
