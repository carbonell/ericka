package models;

public class LaptopPurchaseDetail {
	
	public LaptopPurchaseDetail() {
	}
	
	public LaptopPurchaseDetail(int id, ProductPurchase productPurchase,
			Laptop laptop, int quantity, double cost, double taxes,
			double discount) {
		super();
		this.id = id;
		this.productPurchase = productPurchase;
		this.laptop = laptop;
		this.quantity = quantity;
		this.cost = cost;
		this.taxes = taxes;
		this.discount = discount;
	}

	public LaptopPurchaseDetail(ProductPurchase productPurchase, Laptop laptop,
			int quantity, double cost, double taxes, double discount) {
		super();
		this.id = 0;
		this.productPurchase = productPurchase;
		this.laptop = laptop;
		this.quantity = quantity;
		this.cost = cost;
		this.taxes = taxes;
		this.discount = discount;
	}

	public LaptopPurchaseDetail(Laptop laptop, int quantity, double cost,
			double taxes, double discount) {
		super();
		this.id = 0;
		this.laptop = laptop;
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
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
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
	private Laptop laptop;
	private int quantity;
	private double cost;
	private double taxes;
	private double discount;
}