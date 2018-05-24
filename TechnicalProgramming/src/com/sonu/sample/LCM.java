package com.sonu.sample;

import java.util.Scanner;

public class LCM {
	
	public static int lcm(int n1, int n2)
	{
		int max = n1>n2?n1:n2;
		int c=max;
		while (true) 
		{
			if(max%n1==0 && max%n2==0)
			{
				//System.out.println("LCM is "+max);
				//break; // terminate the method 
				return max;// return statement stop the loop after returning the value
			}
			max= max+c;
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1= sc.nextInt();
		int n2 = sc.nextInt();
		int res=lcm(n1, n2);
		System.out.println("LCM of "+n1+ " and "+n2+" is" +" "+res);

	}

}
