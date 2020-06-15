package com.wipro.languagebasics;

public class Palindrome {
	public static void main(String[] args) {
		int n=1221,temp=n;
		int rev=0,r;
		while(n!=0)		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;		
		}
		if(temp==rev)
		{
			System.out.println(temp+" is a palindrome");
		}
		else
			System.out.println(temp+" not a palindrome");
	}
}
