package com.syedhifzul.assignment.employees;

public class Employee {

	private String name;
	private int EmployeeId;
	private int Salary;
	
	public String getname(){
	    return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public int getEmployeeId(){
		return EmployeeId;
	}
	public void setEmployeeId(int EmployeeId) {
		this.EmployeeId = EmployeeId;
	}
	public int getSalary() {
		return Salary;
		
	}
	public void setSalary(int Salary) {
		this.Salary = Salary;

}
}