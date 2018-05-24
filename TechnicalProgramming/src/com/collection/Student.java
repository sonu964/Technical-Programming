package com.collection;

public class Student implements Comparable
{
	String name;
	double cgpa;
	int id;
	public Student(String name, double cgpa, int id) 
	{
		this.name = name;
		this.cgpa = cgpa;
		this.id = id;
	}
	public String toString()
	{
		return "Name =" +name+" "+ "CGPA = "+cgpa+" "+"ID = "+id;
	}
	@Override
	public int compareTo(Object ar) 
	{
		Student st =(Student)ar;
		//return this.id - st.id;
		return (int)((st.cgpa-this.cgpa)*1000);
		//return (this.name = name.compareTo(st.name));
	}
}
