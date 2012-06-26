package models;

import java.util.Set;
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
	public Set<Product> getSaleProducts() {
		return saleProducts;
	}
	public void setSaleProducts(Set<Product> saleProducts) {
		this.saleProducts = saleProducts;
	}
	
	private int id;
	private Customer customer;
	private Date saleDate;
	private Set<Product> saleProducts;
}