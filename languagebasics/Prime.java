package com.wipro.languagebasics;

public class Prime {
  public static void main(String[] args) {
	  
	  int n=40,k=0;
	  for(int i = 1;i<=n;i++)
	  {
		  if(n%i==0)
		  {
			  k++;
		  }
	  }
	  
	  if(k==2)
	  System.out.println("prime No");
	  else
		 System.out.println("Not a Prime No");
	
}
}
