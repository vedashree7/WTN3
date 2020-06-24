 package com.wipro.Polymorphism;
 class Shape
 {
	 void draw()
	 {
		 System.out.println("Drawing Shape");
	 }
	 void erase()
	 {
		 System.out.println("Erase Shape");
	 }
 }
 class Circle extends Shape
 {
	 void draw()
	 {
		 System.out.println("Drawing Circle");
	 }
	 void erase()
	 {
		 System.out.println("Erase Circle");
	 } 
 }
 class Triangle extends Shape
 {
	 void draw()
	 {
		 System.out.println("Drawing Triangle");
	 }
	 void erase()
	 {
		 System.out.println("Erase Triangle");
	 }
 }
 class Square extends Shape
 {
	 void draw()
	 {
		 System.out.println("Drawing Square");
	 }
	 void erase()
	 {
		 System.out.println("Erase Square");
	 }
 }
public class Shapecheck {
public static void main(String[] args) {
	Shape c=new Circle();
	Shape t=new Triangle();
	Shape s=new Square();
	c.draw();
	c.erase();
	t.draw();
	t.erase();
	s.draw();
	s.erase();
}
}
