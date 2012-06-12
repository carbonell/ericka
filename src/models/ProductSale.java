package models;

import java.util.ArrayList;
import java.util.Date;

public class ProductSale {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	public ArrayList<Product> getSaleProducts() {
		return saleProducts;
	}
	public void setSaleProducts(ArrayList<Product> saleProducts) {
		this.saleProducts = saleProducts;
	}
	
	private int id;
	private Customer customer;
	private Date saleDate;
	private ArrayList<Product> saleProducts;
}