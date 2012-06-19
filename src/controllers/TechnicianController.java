package controllers;

import java.util.ArrayList;

import models.Technician;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class TechnicianController {
	private static SessionFactory sf;
	private static ServiceRegistry serviceRegistry;
	private Session session;
	
	public Technician getSingle() {
		Technician singleTechnician = new Technician();
		
		return singleTechnician;
	}
	
	public ArrayList<Technician> getTechnicians() {
		ArrayList<Technician> technicians = new ArrayList<Technician>();
		
		try {
			configureSession();
			session = sf.openSession();
			Query q  = session.createQuery("from Technician");
			
			for (Object o : q.list())
			{
				technicians.add((Technician) o);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
		
		return technicians;
	}
	
	private void configureSession() throws ExceptionInInitializerError {
		try {
			Configuration cfg = new Configuration()
				.addResource("Technician.hbm.xml")
				.addResource("Address.hbm.xml")
				.configure();
			
			serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(cfg.getProperties())
				.buildServiceRegistry();
			
			sf = cfg.buildSessionFactory(serviceRegistry);
		}
		catch (Throwable ex)
		{
			System.err.println("Failed to create sessionFactory object."+ ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
}