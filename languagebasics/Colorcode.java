package com.wipro.languagebasics;

public class Colorcode {
	

	public static void main(String[] args) {
		char ip='O';
	    switch(ip)
	    {
	    case 'R':{
	    	System.out.println("RED");
	    	break;
	       }
	    case 'B':{
	    	System.out.println("BLUE");
	    	break;
	       }
	    case 'G':{
	    	System.out.println("GREEN");
	    	break;
	       }
	    case 'O':{
	    	System.out.println("ORANGE");
	    	break;
	       }
	    case 'Y':{
	    	System.out.println("YELLOW");
	    	break;
	       }
	    case 'W':{
	    	System.out.println("WHITE");
	    	break;
	       }
	    default:
	    	System.out.println("Invalid Code");
	    }
	}

}
