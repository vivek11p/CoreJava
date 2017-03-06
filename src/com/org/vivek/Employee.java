package com.org.vivek;

import java.util.Comparator;

public class Employee implements Comparable{

	private String name;
	private int empId;
	
	public Employee(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public int compareTo(Object arg0) {
		Employee e0=(Employee)arg0;
		
		/*if(this.name.compareTo(e0.name)>=0)
			return 1;
		else 
			return 0;*/
		//return this.empId-e0.empId;
		/*if(this.name.compareTo(e0.name)!=0)
			return this.name.compareTo(e0.name);
		if(this.empId-e0.empId!=0)
			return e0.empId-this.empId;
		return 0;*/
		if(this==null || e0==null)
			return 0;
		return this.getName().compareTo(e0.getName());
	}
	@Override
	public String toString()
	{
		return this.name+this.empId;
	}
}
