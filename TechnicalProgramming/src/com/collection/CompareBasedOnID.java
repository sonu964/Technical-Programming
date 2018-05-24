package com.collection;

import java.util.Comparator;

// for customize sorting order
public class CompareBasedOnID  implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		
			Student st1 = (Student)o1;
			Student st2 = (Student)o2;
			return st1.id -st2.id;
		
	}

}
