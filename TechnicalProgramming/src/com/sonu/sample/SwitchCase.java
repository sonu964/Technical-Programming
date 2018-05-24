package com.sonu.sample;

public class SwitchCase {

	public static void main(String[] args) 
	{
		int a = 7;
		int b = 5;
		switch(a/a%b)
		{
			case 1 : a = a-b;
			break;
			case 2 : a = a+b;
			break;
			case 3 : a = a*b;
			break;
			case 4 : a = a/b;
			default :a = a;
		}

	}

}
