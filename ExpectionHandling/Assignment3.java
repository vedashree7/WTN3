package com.wipro.ExpectionHandling;
import java.util.*;
public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of element in array");
		int n=sc.nextInt();
		int arr[]=new int[n];  
		System.out.println("Enter the element in an arraay ");
		
		try{for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the index no");
		int index=sc.nextInt();
		
			System.out.println("The value at the index is"+index+"= "+arr[index]);
			System.out.println("The array element is sucessfully accessed ");
		}
		catch(InputMismatchException e)
		{
			System.out.println("java.util.InputMismatchException");
		}
	
	}

}



