package com.wipro.languagebasics;

public class PrimeNumbers {

    public static void main(String[] args) {
	        int low = 10, high = 99;
	        while (low < high) {
	            boolean flag = false;
	            for(int i = 2; i <= low/2; ++i) {
	              
	                if(low % i == 0) {
	                    flag = true;
	                    break;
	                }
	            }
	            if (flag==false && low>1)
	                System.out.print(low + " ");
	            ++low;
	        }
	    }

}
