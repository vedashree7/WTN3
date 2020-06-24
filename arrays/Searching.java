package com.wipro.arrays;

public class Searching {
public static void main(String[] args) {
	int arr[]=new int[] {1,5,7,3,2};
	int key=7,i;
	boolean found=false;
	int l = arr.length;
	for( i=0;i<l-1;i++)
	{
		if (arr[i]==key)
		{
			found=true;
			break;
		}
		
	}
	if (found)   //When found is true, the index of the location of key will be printed.
    {
          System.out.println("Found " + key + " at index " + i + ".");
    }
    else
    {
          System.out.println("-1");
    }
	
	

}
}
