package models;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="productpurchase")
public class ProductPurchase {
	
	public ProductPurchase() {
	}
	
	public ProductPurchase(int id, Supplier supplier, Date purchaseDate,
			Set<Product> products) {
		super();
		this.id = id;
		this.supplier = supplier;
		this.purchaseDate = purchaseDate;
		this.products = products;
	}

	public ProductPurchase(Supplier supplier, Date purchaseDate,
			Set<Product> products) {
		super();
		this.id = 0;
		this.supplier = supplier;
		this.purchaseDate = purchaseDate;
		this.products = products;
	}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	@ManyToOne
	@JoinColumn(name="supplier")
	public Supplier getSupplier() {
		return supplier;
	}

	@Column(name="date")
	public Date getPurchaseDate() {
		return purchaseDate;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	public Set<Product> getProducts() {
		return products;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	private int id;
	private Supplier supplier;
	private Date purchaseDate;
	private Set<Product> products;
}