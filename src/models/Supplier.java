package models;

import javax.persistence.*;

@Entity
@Table(name="supplier")
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
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	@Column
	public String getName() {
		return name;
	}

	@Column
	public String getAgentName() {
		return agentName;
	}

	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
	@JoinColumn(name="address")
	public Address getAddress() {
		return address;
	}

	@Column
	public String getPhone() {
		return phone;
	}

	@Column
	public String getCellphone() {
		return cellphone;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
