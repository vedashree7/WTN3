package com.wipro.Encapsulation;

public class Book {
	String name;
	String author;
	double price;
	int qtyInStock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

		public static void main(String[] args) {
			Book b=new Book();
			b.setName("THE Village");
			b.setAuthor("RamaKrishna");
			b.setPrice(500);
			b.setQtyInStock(2);
           System.out.println("The book name is ="+b.getName()+"\nThe author name is ="+b.getAuthor()+"\nThe price of book is="+b.getPrice()+"\nNo of books ="+b.getQtyInStock());			
		}
}
	


