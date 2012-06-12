package models;

import java.util.ArrayList;
import java.util.Date;

public class ProductPurchase {
	
	public ProductPurchase() {
	}
	
	public ProductPurchase(int id, Supplier supplier, Date purchaseDate,
			ArrayList<Product> products) {
		super();
		this.id = id;
		this.supplier = supplier;
		this.purchaseDate = purchaseDate;
		this.products = products;
	}

	public ProductPurchase(Supplier supplier, Date purchaseDate,
			ArrayList<Product> products) {
		super();
		this.id = 0;
		this.supplier = supplier;
		this.purchaseDate = purchaseDate;
		this.products = products;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
	private int id;
	private Supplier supplier;
	private Date purchaseDate;
	private ArrayList<Product> products;
}