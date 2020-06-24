package com.wipro.languagebasics;

public class CaseConvert {
	public static void main(String[] args) {
		char alphabet='C';
		char converted;
		if (alphabet>='a'&&alphabet<='z')
		{
			converted=(char) (alphabet-32);
			System.out.println(converted);
		}
		if (alphabet>='A'&&alphabet<='Z')
		{
			converted=(char) (alphabet+32);
			System.out.println(converted);
		}
		}
		 

}
