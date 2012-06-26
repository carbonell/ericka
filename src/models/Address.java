package models;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {
	
	public Address() {
	}
	
	public Address(long id, String addressDetail, Country country,
			Province province, City city) {
		super();
		this.id = id;
		this.addressDetail = addressDetail;
		this.country = country;
		this.province = province;
		this.city = city;
	}
	
	public Address(String addressDetail, Country country,
			Province province, City city) {
		super();
		this.id = 0;
		this.addressDetail = addressDetail;
		this.country = country;
		this.province = province;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return 		addressDetail 		+ ", " 
				+	city.getName() 		+ ". "
				+	province.getName() 	+ ", "
				+	country.getName() 	+ ".";
	}	

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	
	@Column(name="detail")
	public String getAddressDetail() {
		return addressDetail;
	}
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="country")
	public Country getCountry() {
		return country;
	}
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="province")
	public Province getProvince() {
		return province;
	}
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="city")
	public City getCity() {
		return city;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	public void setCity(City city) {
		this.city = city;
	}

	private long id;
	private String addressDetail;
	private Country country;
	private Province province;
	private City city;
}