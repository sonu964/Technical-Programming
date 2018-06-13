package com.jspiders.number_system;

import java.util.Scanner;

public class DecimalToBinary
{
	
	public static String decimalToBinary(int num)
	{
		// 1st Declare a empty String variable to concatenate remainder
		String rem="";
		// 2nd take while loop
		while(num>0)
		{
			// inside the while loop extract the remainder
			rem = num%2 + rem;
			// then divide the number by 2 store the quotient and do the same task upto quotient greater than zero
			num=num/2;
		}
		//return statement with matching return type
		return rem;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		String YourBinaryIs = decimalToBinary(num);
		System.out.println("Binary of " +num+" is : "+YourBinaryIs);
		sc.close();
		
	}

}
