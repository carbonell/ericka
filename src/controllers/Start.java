package controllers;

import models.Smartphone;
import java.lang.System;

public class Start {

	public static void main(String[] args) {
		
		Smartphone smartphone = new Smartphone(13500.00,52,"Blackberry","Bold 9700","Bold 3","Negro",
				"2 GB","GSM/GPRS/EDGE/UMTS/3G HSDPA","480","360","5 MP 2x Digital Zoom","Video Recording",
				"BlackBerry OS","6.0.0","624 MHz","512 MB","Trackpad",false,true,true,true,false,true,true);
		
		SmartphoneController spc = new SmartphoneController();
		
		spc.SaveSmartphone(smartphone);
		
		System.out.println(smartphone);
	}
}