package com.wipro.Inheritance;

public class TestEmployee {

		public static void main(String[] args) {
			Employee e=new Employee();
			Person p=new Person();
			p.setName("krishna");
			e.setSalary(500000);
			e.setYear(2000);
			e.setInsuranceNo("1A549D63");
			System.out.println("Name ="+p.getName()+"\nSalary="+e.getSalary()+"\nJoined Year ="+e.getYear()+"\nInsurance No="+e.getInsuranceNo());
					
		}

	}
