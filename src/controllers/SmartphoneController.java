package controllers;

import models.Smartphone;

public class SmartphoneController {
	private HbnPersistanceSessionManager pm = HbnPersistanceSessionManager.getInstance();

	public Smartphone getSingleSmartphone (long id) {
		Smartphone s = new Smartphone();
		try {
			s = (Smartphone) pm.getSessionInstance().load(Smartphone.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return s;
	}
	
	public void saveSmartphone(Smartphone smartphone) {
		try {
			pm.getSessionInstance().save(smartphone);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void updateSmartphone(Smartphone updatedSmartphone){
		try {
			pm.getSessionInstance().update(updatedSmartphone);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteSmartphone(Smartphone smartphone) {
		try {
			pm.getSessionInstance().delete(smartphone);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}