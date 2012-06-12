package controllers;

import models.Laptop;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class LaptopController {
	private static SessionFactory sf;
	private static ServiceRegistry serviceRegistry;

	public void saveLaptop(Laptop laptop){
		Session session = null;
		
		try 
		{
			configureSession();
			session = sf.openSession();
	
			Transaction tx = session.beginTransaction();
			
			session.save(laptop);
			tx.commit();
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
	}
	
	public void updateLaptop(Laptop laptop) {
		Session session = null;
		
		try 
		{
			configureSession();
			
			session = sf.openSession();
	
			Transaction tx = session.beginTransaction();
			
			session.update(laptop);
			tx.commit();
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
	}
	
	public void deleteLaptop(Laptop laptop) {
		Session session = null;
		
		try 
		{
			configureSession();
			
			session = sf.openSession();
	
			Transaction tx = session.beginTransaction();
			
			session.delete(laptop);
			tx.commit();
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
	}

	private void configureSession() throws ExceptionInInitializerError {
		try
		{
			Configuration cfg = new Configuration().addResource(
			"Laptop.hbm.xml").configure();
			serviceRegistry = new ServiceRegistryBuilder().applySettings(
			cfg.getProperties()).buildServiceRegistry();
			sf = cfg.buildSessionFactory(serviceRegistry);
		}
		catch (Throwable ex)
		{
			System.err.println("Failed to create sessionFactory object."+ ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
}