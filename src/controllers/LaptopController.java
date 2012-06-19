package controllers;

import models.Laptop;

public class LaptopController {
	HbnPersistanceSessionManager pm = HbnPersistanceSessionManager.getInstance();
	
	public Laptop getSingleLaptop (long id) {
		Laptop l = new Laptop();
		try {
			l = (Laptop) pm.getSessionInstance().load(Laptop.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return l;
	}
	
	public void saveLaptop(Laptop laptop){
		try {
			pm.getSessionInstance().save(laptop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void updateLaptop(Laptop laptop) {		
		try {
			pm.getSessionInstance().update(laptop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteLaptop(Laptop laptop) {
		try {
			pm.getSessionInstance().delete(laptop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}