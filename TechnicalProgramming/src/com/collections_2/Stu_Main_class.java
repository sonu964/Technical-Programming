package com.collections_2;

import java.util.ArrayList;
import java.util.Collections;


public class Stu_Main_class 
{

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		Student s1 = new Student("Rupma", 3.68, 33);
		Student s2 = new Student("Ashis", 3.85, 85);
		Student s3 = new Student("Samiha", 3.75, 56);
		Student s4 = new Student("Samara", 3.75, 19);
		Student s5 = new Student("Fahim", 3.77, 22);
		Student s6 = new Student("Fahim", 3.76, 2);
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		a1.add(s6);
		
		CompareOnDifferentParameters cd = new CompareOnDifferentParameters();
		Collections.sort(a1,cd);
		for (int i = 0; i < a1.size(); i++) 
		{
			System.out.println(a1.get(i));
		}

	}

}
