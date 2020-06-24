/**
 * 
 */
package com.wipro.languagebasics;

/**
 * @author vedas
 *
 */
public class Typeofnumber {
	public static void main(String args[])
	{
		int x;
		x=Integer.parseInt(args[0]);
		if(x<0)
		{
			System.out.println("Negative");
		}
		if(x==0)
		{
			System.out.println("Zero");
		}
		if(x>0)
		{
			System.out.println("Postive");
		}
	}

}
