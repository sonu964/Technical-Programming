package com.sonu.kartik_sir.TrianglePattern;

/*

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 

*/
public class Triangle1 {

	public static void main(String[] args)
	{
	int n=7;
	for (int row = 0; row < n; row++) 
	{
		/*for (int col = 0; col < n; col++) 
		{
			if(row>=col)
			{
				System.out.print("* ");
			}
			// in this type of program space not required to print so we can say no use of else part
			else
			{
				System.out.print("  ");
			}
			
		}
		System.out.println();
	}
	*/
		for (int col = 0; col <=row; col++) 
		{	
				System.out.print("* ");
		
		}
		System.out.println();
	}

	}

}
