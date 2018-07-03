package com.sonu.array;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.TreeSet;

public class DuplicateEleements {
	
/*	public static void deleteElement(int ar[])
	{
		int size = ar.length;
		System.out.println("deleteElement method started..");
		for (int i = 0; i < size-1; i++) 
		{
			//int count=1;
			int count = 0;
			for (int j = i+1; j <size; j++)
			{
				
				
				if(ar[i]==ar[j])
				{
					count++;
					int k=j;
					while(k<size-1)
					{
						ar[k]=ar[k+1];
						
						k++;
						
					}
					
					j--;
					size--;
					
				}
				
				
			}
			
		}
		int nar[] = new int[size];
		for (int i = 0; i < size; i++)
		{
			nar[i]=ar[i];
		}
		
		return nar;
		
		
		
		TreeSet<Integer> duplicate = new TreeSet<>();

		TreeSet<Integer> non_duplicate = new TreeSet<>();
		
		for (int i = 0; i < ar.length; i++) {
			
			if(!non_duplicate.contains(ar[i])){
				
				non_duplicate.add(ar[i]);
			}else{
				
				duplicate.add(ar[i]);
			}
			
		}
		
		System.out.println(non_duplicate);
		
		
	}
*/
	
	public static void main(String[] args) {
		
		
		Scanner  sc = new Scanner(System.in);
		
		int ar[] = new int[52];
		
		System.out.println("Entr the size");
		int size = sc.nextInt();
	
		for (int i = 0; i < size; i++)
		{
			System.out.println("Enter the value at "+i+"value");
			ar[i]=sc.nextInt();
		}
		System.out.println("array elements before deleting");
		for (int i = 0; i < size; i++) 
		{
			System.out.println("ar["+i+"]=" +ar[i]);
		
		}
		//deleteElement(ar);
		
		for (int i = 0; i < size; i++) {
			
			for (int j = i+1; j < size; ) {

				if(ar[i] == ar[j]){
					
					for (int k= j; k < size-1; k++) {
						
						ar[k] = ar[k+1];
						
					}
					size--;
					
				}else{
					
					j++;
				}
			}
			
		}
		
		for (int i = 0; i < size; i++) {
			
			System.out.println(ar[i]);
		}

		
	}

}
