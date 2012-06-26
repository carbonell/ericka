package controllers;

import models.Customer;

public class CustomerController {
	private HbnPersistanceSessionManager pm = HbnPersistanceSessionManager.getInstance();
	
	public Customer getSingleCustomer (long id) {
		Customer c = new Customer();
		try {
			c = (Customer) pm.getSessionInstance().load(Customer.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return c;
	}
	
	public void saveCustomer(Customer customer){
		try {
			pm.getSessionInstance().save(customer.getAddress());
			pm.getSessionInstance().flush();
			pm.getSessionInstance().save(customer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void updateCustomer(Customer customer) {		
		try {
			pm.getSessionInstance().update(customer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteCustomer(Customer customer) {
		try {
			pm.getSessionInstance().delete(customer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
