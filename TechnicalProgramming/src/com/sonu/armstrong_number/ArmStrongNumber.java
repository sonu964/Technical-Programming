package com.sonu.armstrong_number;

import java.util.Scanner;

public class ArmStrongNumber {
	public static int power(int num, int pwr)
	{
		int res=1;
		for (int i = 1; i <=pwr; i++)
		{
			res = res*i;
		}
		return res;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
	

	}

}
