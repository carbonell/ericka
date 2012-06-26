package controllers;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import models.*;

public class Start {
	public static void main(String[] args) {
		
		AddressController ac = new AddressController();
		
		City ci = ac.getSingleCity(11);
		Province pro = ac.getSingleProvince(31);
		Country coun = ac.getSingleCountry(163);
		
		Address a = new Address("Calle X", coun, pro, ci);
		
		a.toString();
		
		Set<Product> products = new HashSet<Product>();
		
		products.add(new Smartphone());
		
		ProductPurchase pp = new ProductPurchase(
				new Supplier("SM Pieces", "Alvin", a, "(809)231-8453", "(829)578-9885"),
				Calendar.getInstance().getTime(),
				products
		);
	}
}