package com.sonu.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
	    int size = sc.nextInt();
	    String [] ar = new String [size];
	    
	    for(int i=0; i<ar.length;i++){
	        System.out.println("Enter the element at index "+i+"");
	        ar[i] = sc.next();
	    }

	    for(int j=0; j<ar.length;j++){
	        
	        System.out.println("ar["+j+"] = "+ar[j]);
	    }
	    
	    Set<String> nonDuplicatSet = new HashSet<String>();
	    Set<String> duplicateSet = new HashSet<String>();

	    for (String string : ar) {

	        if(!nonDuplicatSet.contains(string)){
	            nonDuplicatSet.add(string);
	        }else{
	            duplicateSet.add(string);
	        }
	        
	    }
	    System.out.println(nonDuplicatSet);
	    System.out.println(duplicateSet);

	    sc.close();
	    

	}
	
}
