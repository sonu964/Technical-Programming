package com.jspiders.number_system;

import java.util.Scanner;
 public class ConverToAny2
{

	 public static String decimalToAny(int num, int ns)
	 {
	
		String s1="0123456789ABCDEF";
		String res = "";
		while(num>0)
		{
			//extract the number
			int rem = num%ns;
			
			//concatinate the remainders
			res=s1.charAt(rem)+res;
			
			//perform next operation on quotient	
			num = num/ns;
		}
		
		return res;
}

public static void main(String[] args)
{
	System.out.println("main method s");
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int num = sc.nextInt();
	
	System.out.println("Enter the number system");
	int ns = sc.nextInt();
	
	String res =decimalToAny(num,ns);
	
	System.out.println("the"+ns+" equvalent of " +num+"="+res);
	System.out.println("main method ended");

}


}
