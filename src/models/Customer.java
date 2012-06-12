package models;

public class Customer {
	
	public Customer() {
	}
	
	public Customer(int id, String firstName, String firstMidName,
			String lastName, String phone, String cellphone, Address address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.firstMidName = firstMidName;
		this.lastName = lastName;
		this.phone = phone;
		this.cellphone = cellphone;
		this.address = address;
	}
	
	public Customer(String firstName, String firstMidName, String lastName,
			String phone, String cellphone, Address address) {
		super();
		this.id = 0;
		this.firstName = firstName;
		this.firstMidName = firstMidName;
		this.lastName = lastName;
		this.phone = phone;
		this.cellphone = cellphone;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstMidName() {
		return firstMidName;
	}
	public void setFirstMidName(String firstMidName) {
		this.firstMidName = firstMidName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	private int id;
	private String firstName;
	private String firstMidName;
	private String lastName;
	private String phone;
	private String cellphone;
	private Address address;
}