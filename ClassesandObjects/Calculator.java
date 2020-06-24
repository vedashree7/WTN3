package com.wipro.ClassesandObjects;

public class Calculator {
	 int a;
	 int b;
	 static double PowerInt(int num1,int num2)
	{
		return Math.pow(num1, num2);
	}
    static double PowerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}

    public static void main(String args[])
    {
      System.out.println("The power of double is ="+Calculator.PowerDouble(2.3, 3));
    	System.out.println("The power of int is= "+(int)Calculator.PowerInt(2,3));
    }
}
