package com.jspiders.number_system;

import java.util.Scanner;

public class ConvertBinaryToDecimalToValidate {

	
		public static int power(int num,int pwr)
		{
			int res=1;
			for (int i = 0; i <=pwr; i++) 
			{
				res= res*num;
			}
			return res;
		}
		
		public static boolean validate(int num)
		{
			while(num>0)
			{
				
				int rem = num%10;
				if(rem>=2)
				{
					return false;
				}
				num= num/10;
			}
			return true;
		
		}
		
		
		public static int binaryToDecimal(int num)
		{
			int count =0;
			int out=0;
			while(num>0)
			{
				int rem = num%10;
				out=out+rem*power(2,count++);
				num=num/10;
			}
			return out;
		}

		public static void main(String[] args)
		{
			System.out.println("main method s");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the  number");
			int num = (sc.nextInt());
			//if()
			{
				int res=binaryToDecimal( num);
			
			System.out.println("the"+" equvalent of " +res);
			System.out.println("main method ended");

		}

	}

}
