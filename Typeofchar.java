package com.wipro.languagebasics;

public class Typeofchar {
	public static void main(String[] args) {
		char input= 'c';
         if((input>=65&&input<=90)||(input>=97&&input<=122))
         {
        	 System.out.println("Alphabet");
         }
         else if(input>=0&&input<=9)
         {
        	 System.out.println("Digit");
         }
         else
        	 System.out.println("Special Symbol");
		
	}

}

