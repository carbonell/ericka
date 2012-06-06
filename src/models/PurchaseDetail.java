package models;

public class PurchaseDetail {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Purchase getPurshase() {
		return purshase;
	}
	public void setPurshase(Purchase purshase) {
		this.purshase = purshase;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getTaxes() {
		return taxes;
	}
	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	private int id;
	private Purchase purshase;
	private Product product;
	private int quantity;
	private double cost;
	private double taxes;
	private double discount;
}
