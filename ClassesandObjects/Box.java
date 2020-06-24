package com.wipro.ClassesandObjects;

public class Box {
	int h,b,d;
	Box(int h,int b,int d)
	{
		this.h=h;
		this.b=b;
		this.d=d;
     	}
	int Volume()
	{
		int v;
		v=h*b*d;
		return v;
	}
	public static void main(String[] args) {
		Box v=new Box(2,3,4);
		System.out.println("the volume of box ="+v.Volume());
	     
	}

}

