package com.sonu.kartik_sir.alphabets;
import java.util.Scanner;
public class MaxNum2 
{
	static Scanner sc;
	 
	

	public static void main(String[] args)
	{
		
			sc = new Scanner(System.in);
			System.out.println("Enter the numbers to find gratest number");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			int n4 = sc.nextInt();
			int n5 = sc.nextInt();
	
		//int n1 = 20,n2=30,n3=37,n4=80,n5=100;
		
		int maxNum = (n1>n2 && n1>n3 && n1>n4 && n1>n5)?+n1:(n2>n3 && n2>n4 && n2>n5)?+n2:(n3>n4 && n3>n5)?+n3:(n4>n5)?+n4:+n5;
		System.out.println("Gratest Number is "+maxNum);
	}

}
