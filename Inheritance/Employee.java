package com.wipro.Inheritance;

 public class Employee extends Person{
	
	 	double salary;
	 	double year;
	 	String InsuranceNo;
	 	public double getSalary() {
	 		return salary;
	 	}
	 	public void setSalary(double salary) {
	 		this.salary = salary;
	 	}
	 	public double getYear() {
	 		return year;
	 	}
	 	public void setYear(double year) {
	 		this.year = year;
	 	}
	 	public String getInsuranceNo() {
	 		return InsuranceNo;
	 	}
	 	public void setInsuranceNo(String insuranceNo) {
	 		InsuranceNo = insuranceNo;
	 	}
	 }

