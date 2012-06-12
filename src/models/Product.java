package models;

public abstract class Product {
	
	public Product() {
	}
	
	public Product(double price, int stock) {
		super();
		this.id = 0;
		this.price = price;
		this.stock = stock;
	}
	
	public Product(int id, double price, int stock) {
		super();
		this.id = id;
		this.price = price;
		this.stock = stock;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	protected int id;
	protected double price;
	protected int stock;
}
