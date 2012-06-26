package controllers;

import models.Technician;

public class TechnicianController {
	private HbnPersistanceSessionManager pm = HbnPersistanceSessionManager.getInstance();
	
	public Technician getSingleTechnician (long id) {
		Technician t = new Technician();
		try {
			t = (Technician) pm.getSessionInstance().load(Technician.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return t;
	}
	
	public void saveTechnician(Technician technician){
		try {
			pm.getSessionInstance().save(technician.getAddress());
			pm.getSessionInstance().flush();
			pm.getSessionInstance().save(technician);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void updateTechnician(Technician technician) {		
		try {
			pm.getSessionInstance().update(technician);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteTechnician(Technician technician) {
		try {
			pm.getSessionInstance().delete(technician);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}