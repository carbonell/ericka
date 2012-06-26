package controllers;

import models.Address;
import models.City;
import models.Country;
import models.Province;

public class AddressController {
	private HbnPersistanceSessionManager pm = HbnPersistanceSessionManager.getInstance();
	
	public Address getSingleAddress(long id) {
		Address l = new Address();
		try {
			l = (Address) pm.getSessionInstance().load(Address.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return l;
	}
	
	public Country getSingleCountry(long id) {
		Country c = new Country();
		try {
			c = (Country) pm.getSessionInstance().load(Country.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return c;
	}
	
	public Province getSingleProvince(long id) {
		Province p = new Province();
		try {
			p = (Province) pm.getSessionInstance().load(Province.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return p;
	}
	
	public City getSingleCity(long id) {
		City c = new City();
		try {
			c = (City) pm.getSessionInstance().load(City.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return c;
	}
	
	public void saveAddress(Address address){
		try {
			pm.getSessionInstance().save(address);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void updateAddress(Address address) {		
		try {
			pm.getSessionInstance().update(address);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteAddress(Address address) {
		try {
			pm.getSessionInstance().delete(address);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
