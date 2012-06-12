package models;

public class Address {
	
	public Address() {
	}
	
	public Address(int id, String addressDetail, String country, String city,
			String sector) {
		super();
		this.id = id;
		this.addressDetail = addressDetail;
		this.country = country;
		this.city = city;
		this.sector = sector;
	}

	public Address(String addressDetail, String country, String city,
			String sector) {
		super();
		this.id = 0;
		this.addressDetail = addressDetail;
		this.country = country;
		this.city = city;
		this.sector = sector;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	
	private int id;
	private String addressDetail;
	private String country;
	private String city;
	private String sector;
}