package com.wipro.Inheritance;
 class Animal {
	public void eat()
	{
		System.out.println("Eat-Animal");
	}
	public void sleep()
	{
		System.out.println("Sleep-Animal");
	}

}
	 class Bird extends Animal{
		public void eat()
	  	{
			super.eat();
			System.out.println("Eat-Bird");
		}
		public void sleep()
		{
			super.sleep();
			System.out.println("Sleep-Bird");
		}
		
		 public void fly()
		 {
			 System.out.println("fly-Bird");
		 }
	 }
		 
		 public  class Overridde {
	 public static void main(String args[])
	  {
		
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
		
	  }
	 }

	