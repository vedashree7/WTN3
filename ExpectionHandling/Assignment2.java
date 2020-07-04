package com.wipro.ExpectionHandling;
import java.util.*;
public class Assignment2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of elements in array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements");
	int i;
	for(i=0;i<n;i++)
		arr[i]=sc.nextInt();
	System.out.println("enter the index no");
	int index=sc.nextInt();
	try
	{
		System.out.println("the array elements in index is"+index+"="+arr[index]);
		System.out.println("the element is loaded succesfully");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	   System.out.println("java.lang.ArrayIndexOutOfBoundsException");
	}
	sc.close();
}	

}
