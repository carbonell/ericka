package models;

public class SmartphoneSaleDetail {
	
	public SmartphoneSaleDetail() {
	}
	
	public SmartphoneSaleDetail(int id, ProductSale productSale,
			Smartphone smartphone, int quantity, double price, double taxes,
			double discount) {
		super();
		this.id = id;
		this.productSale = productSale;
		this.smartphone = smartphone;
		this.quantity = quantity;
		this.price = price;
		this.taxes = taxes;
		this.discount = discount;
	}
	
	public SmartphoneSaleDetail(ProductSale productSale, Smartphone smartphone,
			int quantity, double price, double taxes, double discount) {
		super();
		this.id = 0;
		this.productSale = productSale;
		this.smartphone = smartphone;
		this.quantity = quantity;
		this.price = price;
		this.taxes = taxes;
		this.discount = discount;
	}
	
	public SmartphoneSaleDetail(Smartphone smartphone, int quantity,
			double price, double taxes, double discount) {
		super();
		this.id = 0;
		this.smartphone = smartphone;
		this.quantity = quantity;
		this.price = price;
		this.taxes = taxes;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ProductSale getProductSale() {
		return productSale;
	}
	public void setProductSale(ProductSale productSale) {
		this.productSale = productSale;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
	private ProductSale productSale;
	private Smartphone smartphone;
	private int quantity;
	private double price;
	private double taxes;
	private double discount;
}