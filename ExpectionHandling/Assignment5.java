package com.wipro.ExpectionHandling;
import java.util.*;

public class Assignment5 {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	try {
	double n3=division(n1,n2);
	System.out.println("the value of n3 is= "+n3);
	}
	catch(ArithmeticException e) {
	System.out.println(e);
}	
	sc.close();
}
public static double division(int a,int b)throws  ArithmeticException{
	return a/b;
}



}
