package com.string;

import java.util.Scanner;
// write algoritham for it
public class NumbersToWords 
{
	static String []s1=/* don't have zero and ten*/{"","","twenty","thirty","fourty","fifty","sixty","seventy"
			,"eigthy","ninety"};
	static  String []s2=/* don't have zero*/{"","one","two","three","four","five","six","seven","eigth"
			,"nine","ten","eleven","tweleve","thirteen","fourteen","fifteen",
			"sixteent","seventy","eighty","ninteen"};
	
	public static void concat(int num,String str)
	{
		if(num<=19)
		{
			System.out.println(s1[num/10]+" "+s2[num%10]);
		}
		else
		{
			System.out.println(s2[num]);
		}
		if(num>0)
		System.out.println(str);
	}
// if number is 1 to 19 one array is sufficient and 20 to 99 two array should be concatenate
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numeric values");
		int num = sc.nextInt();
		
		concat(num/10000000, "Crore");
		concat((num/100000)%100, "lakh");
		concat((num/1000)%100, "thousand");
		concat((num/10)%10, "hundred");//for extract one digit
		concat((num/100)%100, " ");// for extract last two digit
		sc.close();		

	}

}
