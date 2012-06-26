package models;

import javax.persistence.*;

@Entity
@Table(name="")
public class Technician {
	
	public Technician() {
	}
	
	public Technician(int id, String firstName, String firstMidName,
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

	public Technician(String firstName, String firstMidName, String lastName,
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
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	
	@Column
	public String getFirstName() {
		return firstName;
	}

	@Column
	public String getFirstMidName() {
		return firstMidName;
	}

	@Column
	public String getLastName() {
		return lastName;
	}

	@Column
	public String getPhone() {
		return phone;
	}

	@Column
	public String getCellphone() {
		return cellphone;
	}

	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
	@JoinColumn(name="address")
	public Address getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setFirstMidName(String firstMidName) {
		this.firstMidName = firstMidName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
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