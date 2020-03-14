package com.example.demo.entity;

public class Product {
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name;
	private double price;
	private int inStock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getInStock() {
		return inStock;
	}
	public void setInStock(int inStock) {
		this.inStock = inStock;
	}
	public Product(String name, double price, int inStock) {
		super();
		this.name = name;
		this.price = price;
		this.inStock = inStock;
	} 
	
	
}
