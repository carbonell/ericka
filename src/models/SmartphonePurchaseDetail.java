package models;

public class SmartphonePurchaseDetail {
	
	public SmartphonePurchaseDetail() {
	}
	
	public SmartphonePurchaseDetail(int id, ProductPurchase productPurchase,
			Smartphone smartphone, int quantity, double cost, double taxes,
			double discount) {
		super();
		this.id = id;
		this.productPurchase = productPurchase;
		this.smartphone = smartphone;
		this.quantity = quantity;
		this.cost = cost;
		this.taxes = taxes;
		this.discount = discount;
	}

	public SmartphonePurchaseDetail(ProductPurchase productPurchase,
			Smartphone smartphone, int quantity, double cost, double taxes,
			double discount) {
		super();
		this.id = 0;
		this.productPurchase = productPurchase;
		this.smartphone = smartphone;
		this.quantity = quantity;
		this.cost = cost;
		this.taxes = taxes;
		this.discount = discount;
	}

	public SmartphonePurchaseDetail(Smartphone smartphone, int quantity,
			double cost, double taxes, double discount) {
		super();
		this.smartphone = smartphone;
		this.quantity = quantity;
		this.cost = cost;
		this.taxes = taxes;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ProductPurchase getProductPurchase() {
		return productPurchase;
	}
	public void setProductPurchase(ProductPurchase productPurchase) {
		this.productPurchase = productPurchase;
	}
	public Smartphone getSmartphone() {
		return smartphone;
	}
	public void setSmartphone(Smartphone smartphone) {
		this.smartphone = smartphone;
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
	private ProductPurchase productPurchase;
	private Smartphone smartphone;
	private int quantity;
	private double cost;
	private double taxes;
	private double discount;
}