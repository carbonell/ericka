package models;

import javax.persistence.*;

@Entity
public interface Product {
	@Id
	@GeneratedValue
	public long getId();
	
	@Column(name="price")
	public double getPrice();
	
	@Column(name="stock")
	public int getStock();
	
	public void setId(long id);
	public void setPrice(double price);
	public void setStock(int stock);
}
