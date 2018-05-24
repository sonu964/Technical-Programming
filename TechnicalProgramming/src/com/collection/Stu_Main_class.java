package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Stu_Main_class
{

	public static void main(String[] args)
	{
		ArrayList<Student> a1 = new ArrayList<Student>();
		Student s1 = new Student("Rupma", 3.68, 33);
		Student s2 = new Student("Ashis", 3.85, 85);
		Student s3 = new Student("Samiha", 3.75, 56);
		Student s4 = new Student("Samara", 3.75, 19);
		Student s5 = new Student("Fahim", 3.76, 22);
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		//Collections.sort(a1);
		System.out.println("default natural sorting order on cgpa decreasing order");
		for (int i = 0; i < a1.size(); i++) 
		{
			System.out.println(a1.get(i));
		}
		/*Comparator cref =(Object o1, Object o2)->
		
					{
						Student st1 = (Student)o1;
						Student st2 = (Student)o2;
						return st1.id -st2.id;
					};*/
		CompareBasedOnID cid = new CompareBasedOnID();
		Collections.sort(a1,cid);
		System.out.println("Customize sorting order on ID -----");
		for (int i = 0; i < a1.size(); i++) 
		{
			System.out.println(a1.get(i));
		}
		
		
		CompareBasedOnName cname = new CompareBasedOnName();
		Collections.sort(a1,cname);
		System.out.println("Customize sorting order on name");
		for (int i = 0; i < a1.size(); i++) 
		{
			System.out.println(a1.get(i));
		}
		

	}

}
