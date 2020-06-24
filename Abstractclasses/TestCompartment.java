package com.wipro.Abstractclasses;

import java.util.*;

abstract class Compartment {
	public abstract String notice();
}
 class FirstClass extends Compartment {
	public String notice() {
             return "Notice:It is First Class Comparment";	
	}

}
 class Ladies extends Compartment {
	public String notice() {
        return "Notice:It is Ladies Comparment";	
}

}class General extends Compartment {
	public String notice() {
        return "Notice:It is general Comparment";	
}

}
class Lagguage extends Compartment {
	public String notice() {
        return "Notice:It is Lagguage Comparment";	
}

}

public class TestCompartment {
       public static void main(String[] args) {
    		Compartment[] cp = new Compartment[10];
            int i;
    		Random rand = new Random();
    	    
    	    for ( i = 0; i < 10; i++) {
    	    	int randomNum = rand.nextInt(4)+1;
    	    	
    	    	if (randomNum == 1)
    	    		cp[i] = new FirstClass();
    	    	else if (randomNum == 2)
    	    		cp[i] = new Ladies();
    	    	else if (randomNum == 3)
    	    		cp[i] = new General();
    	    	else if (randomNum == 4)
    	    		cp[i] = new  Lagguage();
    	    	 
    	    		System.out.println(cp[i].notice());
    	    
}
}
}
