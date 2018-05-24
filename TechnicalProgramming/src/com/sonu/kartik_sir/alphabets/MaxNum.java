package com.sonu.kartik_sir.alphabets;

public class MaxNum 
{

	public static void main(String[] args) 
	{
		int num1=21,num2=37,num3=40;
		int maxNum =(num1>num2 && num1>num3)?21:((num2>num3)?37:40);
		System.out.println("Max Number = "+maxNum);
	
	}

}
