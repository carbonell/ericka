package models;

public class LaptopSaleDetail {
	
	public LaptopSaleDetail() {
	}
	
	public LaptopSaleDetail(int id, ProductSale productSale, Person laptop,
			int quantity, double price, double taxes, double discount) {
		super();
		this.id = id;
		this.productSale = productSale;
		this.laptop = laptop;
		this.quantity = quantity;
		this.price = price;
		this.taxes = taxes;
		this.discount = discount;
	}

	public LaptopSaleDetail(ProductSale productSale, Person laptop,
			int quantity, double price, double taxes, double discount) {
		super();
		this.id = 0;
		this.productSale = productSale;
		this.laptop = laptop;
		this.quantity = quantity;
		this.price = price;
		this.taxes = taxes;
		this.discount = discount;
	}

	public LaptopSaleDetail(Person laptop, int quantity, double price,
			double taxes, double discount) {
		super();
		this.id = 0;
		this.laptop = laptop;
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
	public Person getLaptop() {
		return laptop;
	}
	public void setLaptop(Person laptop) {
		this.laptop = laptop;
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
	private Person laptop;
	private int quantity;
	private double price;
	private double taxes;
	private double discount;
}