package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HbnPersistanceSessionManager {
	
	private static HbnPersistanceSessionManager hbnPersistanceSessionManager;
	private static ServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	private static Session session;
	
	public Session getSessionInstance() {
		if (sessionFactory == null) { sessionFactory = configureSession(); }
		if (session == null) { session = sessionFactory.openSession(); }
		return session;
	}
	
	public static HbnPersistanceSessionManager getInstance() {
		if (hbnPersistanceSessionManager == null) { hbnPersistanceSessionManager = new HbnPersistanceSessionManager(); }
		return hbnPersistanceSessionManager;
	}
	
	private HbnPersistanceSessionManager(){
	}
	
	private SessionFactory configureSession() throws ExceptionInInitializerError {
		SessionFactory sessionFactory;

		try {
			Configuration cfg = new Configuration()
				.addAnnotatedClass(models.Address.class)
				.addAnnotatedClass(models.City.class)
				.addAnnotatedClass(models.Country.class)
				.addAnnotatedClass(models.Customer.class)
				.addAnnotatedClass(models.Laptop.class)
				.addAnnotatedClass(models.Product.class)
				.addAnnotatedClass(models.ProductPurchase.class)
				.addAnnotatedClass(models.Province.class)
				.addAnnotatedClass(models.Smartphone.class)
				.addAnnotatedClass(models.Supplier.class)
				.addAnnotatedClass(models.Technician.class)
				.configure();
			
			serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(cfg.getProperties())
				.buildServiceRegistry();
			
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		}
		catch (Throwable ex)
		{
			System.err.println("Failed to create sessionFactory object."+ ex);
			throw new ExceptionInInitializerError(ex);
		}
		
		return sessionFactory;
	}
}
