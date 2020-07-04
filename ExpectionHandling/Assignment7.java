package com.wipro.ExpectionHandling;

import java.util.Scanner;

public class Assignment7 {
		
		public void  Assignment7(String username, String userCountry) throws InvalidCountryException {
			if (!userCountry.equals("India"))
				throw new InvalidCountryException();
			else
				System.out.println("User registration done successfully");
			
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Assignment7 registration = new UserRegistration();
			Scanner in=new Scanner(System.in);
			String name=in.nextLine();
			String country=in.nextLine();
			
			try {
				registration.Assignment7(name, country);
				//registration.registerUser("Mini", "India");
			} catch (InvalidCountryException e) {
				System.out.println(e.getMessage());
			}

}
