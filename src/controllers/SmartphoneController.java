package controllers;

import models.Smartphone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SmartphoneController {
	private static SessionFactory sf;
	private static ServiceRegistry serviceRegistry;

	public void saveSmartphone(Smartphone smartphone) {
		Session session = null;
		
		try 
		{
			configureSession();
			
			session = sf.openSession();
	
			Transaction tx = session.beginTransaction();
			
			session.save(smartphone);
			session.flush();
			tx.commit();
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
	}
	
	public void updateSmartphone(Smartphone updatedSmartphone){
		Session session = null;
		
		try 
		{
			configureSession();
			session = sf.openSession();
	
			Transaction tx = session.beginTransaction();
			
			session.update(updatedSmartphone);
			
			tx.commit();
			
			System.out.println("Done");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
	}
	
	public void deleteSmartphone(Smartphone smartphone) {
		Session session = null;
		
		try 
		{
			configureSession();
			session = sf.openSession();
	
			Transaction tx = session.beginTransaction();
			
			session.delete(smartphone);
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
			"Smartphone.hbm.xml").configure();
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