package models;

public class Supplier {
	
	public Supplier() {
	}
	
	public Supplier(int id, String name, String agentName, Address address,
			String phone, String cellphone) {
		super();
		this.id = id;
		this.name = name;
		this.agentName = agentName;
		this.address = address;
		this.phone = phone;
		this.cellphone = cellphone;
	}

	public Supplier(String name, String agentName, Address address,
			String phone, String cellphone) {
		super();
		this.id = 0;
		this.name = name;
		this.agentName = agentName;
		this.address = address;
		this.phone = phone;
		this.cellphone = cellphone;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String agentName) {
		this.agentName = agentName;
	}	
	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	
	private int id;
	private String name;
	private String agentName;
	private Address address;
	private String phone;
	private String cellphone;
}
