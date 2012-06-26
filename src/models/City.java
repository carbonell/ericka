package models;

import javax.persistence.*;

@Entity
@Table(name="city")
public class City {
	
	public City() {
	}
	
	public City(long id, String name, Province ownerProvince) {
		super();
		this.id = id;
		this.name = name;
		this.ownerProvince = ownerProvince;
	}

	public City(String name, Province ownerProvince) {
		super();
		this.id = 0;
		this.name = name;
		this.ownerProvince = ownerProvince;
	}
	
	@Id
	@GeneratedValue
	@Column(insertable=false)
	public long getId() {
		return id;
	}
	
	@Column(insertable=false,updatable=false,nullable=false)
	public String getName() {
		return name;
	}
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="province")
	public Province getOwnerProvince() {
		return ownerProvince;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOwnerProvince(Province ownerProvince) {
		this.ownerProvince = ownerProvince;
	}
	
	private long id;
	private String name;
	private Province ownerProvince;
}
