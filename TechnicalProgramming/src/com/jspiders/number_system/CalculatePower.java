package com.jspiders.number_system;

import java.util.Scanner;

public class CalculatePower 
{
	public static int calculatePower(int num, int pwr)
	{
		// 1st step declaration of variable to store the value
		int n1 = 1;

		// 2nd step take for loop
		for (int i = 1; i <=pwr; i++)
		{
			n1 = n1 * num;
		}
		// 3rd step is return the value to calling method
		return n1;
	}

	public static void main(String[] args) 
	{
		// 4th step is declare the variable that called method will accept
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Enter the power of the number");
		int pwr = sc.nextInt();

		int res = calculatePower(num, pwr);
		System.out.println(num+" to the power "+pwr+ " is : " + res);
		sc.close();
	}

}
