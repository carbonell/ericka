package models;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="country")
public class Country {
	
	public Country() {
	}
	
	public Country(long id, String name, Set<Province> provinces) {
		super();
		this.id = id;
		this.name = name;
		this.provinces = provinces;
	}

	public Country(String name, Set<Province> provinces) {
		super();
		this.id = 0;
		this.name = name;
		this.provinces = provinces;
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
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="ownerCountry",orphanRemoval=true)
	public Set<Province> getProvinces() {
		return provinces;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setProvinces(Set<Province> provinces) {
		this.provinces = provinces;
	}
	
	private long id;
	private String name;
	private Set<Province> provinces;
}
