package com.wipro.arrays;

public class OneFour {
public static void main(String[] args) {
	int a[]=new int[] {1,1,1,4};
    int i;
    boolean b=false;
    for(i=0;i<a.length-1;i++)
    {
    	if(a[i]==4||a[i]==1)
    	{
    		b=true;
    		
    	}
    	else
    	{
    		b=false;
    		break;
    	}
    	
    }
    if(b)
    {
    	System.out.println("true");
    }
    else
    	System.out.println("false");
}
}
