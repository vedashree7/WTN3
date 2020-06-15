package com.wipro.languagebasics;

public class PrimeNoCheck {
	public static void main(String[] args) {
		  
		  int n=97,k=0;
		  for(int i = 1;i<=n;i++)
		  {
			  if(n%i==0)
			  {
				  k++;
			  }
		  }
		  if(n==1 || n==0) {
			  System.out.println(n+ " "+" is neither prime or composite");
		  }
		  else if(k==2)
		  System.out.println(n+" "+"prime No");
		  else
			 System.out.println(n+" "+"Not a Prime No");
		
	}
}
