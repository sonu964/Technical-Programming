package com.sonu.assignment;

import java.util.Scanner;

public class Factorial {

	static int out=1;
	public  static int fact(int num)
	{
		if(num>1)
		{
			out =out*num;
			fact(--num);
		}
		return out;
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int fact = fact(num);
		System.out.println("factorial of "+num+" is "+fact);
		
	}

}
