package com.collections_2;

import java.util.Collections;
import java.util.Comparator;

public class CompareOnDifferentParameters implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		Student st1 =(Student)o1;
		Student st2 =(Student)o2;
		if(st1.cgpa ==st2.cgpa)
		{
			return st1.name.compareTo(st2.name);
		}
		else if((st1.name.equals(st2.name)) && st1.cgpa==st2.cgpa)
		{
			return st1.id-st2.id;
		}
		else
		{
			return (int)((st1.cgpa-st2.cgpa)*1000);
		}
		
		
	}

}
