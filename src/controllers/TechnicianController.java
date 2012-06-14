package controllers;

import java.util.ArrayList;

import models.Technician;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class TechnicianController {
	
	private static SessionFactory sf;
	private static ServiceRegistry serviceRegistry;
	
	public ArrayList<Technician> getTechnicians() {
		ArrayList<Technician> technicians = new ArrayList<Technician>();
		Session session = null;
		
		try 
		{
			configureSession();
			session = sf.openSession();
	
			Transaction tx = session.beginTransaction();
			
			Query q = session.createSQLQuery(	"SELECT tech.id,firstname,firstmidname,lastname,phone,cellphone,nickname," +
												"`password`,city.name AS city,coun.name AS country,sect.name AS sector" +
												"FROM ericka.technician tech JOIN ericka.address `add` ON tech.address = add.id " +
												"JOIN ericka.city city ON add.city = city.id " +
												"JOIN ericka.country coun ON add.country = coun.id " +
												"JOIN ericka.sector sect ON add.sector = sect.id");
			
			for(Object o : q.list()){
				technicians.add((Technician) o);
			}
			
			tx.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
		
		return technicians;
	}
	
	private void configureSession() throws ExceptionInInitializerError {
		try
		{
			Configuration cfg = new Configuration().addResource(
			"Technician.hbm.xml").addResource("Address.hbm.xml").configure();
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
