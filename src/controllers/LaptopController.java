package controllers;

import models.Person;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class LaptopController {
	private static SessionFactory sf;
	private static ServiceRegistry serviceRegistry;
	private Session session;
	public void saveLaptop(Person laptop){
		try {
			configureSession();
			session = sf.openSession();
			session.save(laptop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
	}
	
	public void updateLaptop(Person laptop) {
		Session session = null;
		
		try {
			configureSession();
			session = sf.openSession();
			session.update(laptop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
	}
	
	public void deleteLaptop(Person laptop) {
		Session session = null;
		
		try {
			configureSession();
			session = sf.openSession();
			session.delete(laptop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
	}

	private void configureSession() throws ExceptionInInitializerError {
		try {
			Configuration cfg = new Configuration()
				.addResource("Laptop.hbm.xml")
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