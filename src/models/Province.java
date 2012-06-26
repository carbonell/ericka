package models;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="province")
public class Province {
	
	public Province() {
	}
	
	public Province(long id, String name, Country ownerCountry, Set<City> cities) {
		super();
		this.id = id;
		this.name = name;
		this.ownerCountry = ownerCountry;
		this.cities = cities;
	}

	public Province(String name, Country ownerCountry, Set<City> cities) {
		super();
		this.id = 0;
		this.name = name;
		this.ownerCountry = ownerCountry;
		this.cities = cities;
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
	
	@ManyToOne
	@JoinColumn(name="country")
	public Country getOwnerCountry() {
		return ownerCountry;
	}
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="ownerProvince",orphanRemoval=true)
	public Set<City> getCities() {
		return cities;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOwnerCountry(Country ownerCountry) {
		this.ownerCountry = ownerCountry;
	}
	public void setCities(Set<City> cities) {
		this.cities = cities;
	}
	
	private long id;
	private String name;
	private Country ownerCountry;
	private Set<City> cities;
}
