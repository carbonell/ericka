package controllers;

//import models.Laptop;
//import models.Smartphone;

public class Start {

	public static void main(String[] args) {
		/*
		Smartphone smartphone = new Smartphone(13500.00,52,"Blackberry","Bold 9700","Bold 3","Negro",
				"2 GB","GSM/GPRS/EDGE/UMTS/3G HSDPA","480","360","5 MP 2x Digital Zoom","Video Recording",
				"BlackBerry OS","6.0.0","624 MHz","512 MB","Trackpad",false,true,true,true,false,true,true);
		
		SmartphoneController spc = new SmartphoneController();
		
		spc.saveSmartphone(smartphone);
		smartphone.setId(0);
		spc.deleteSmartphone(smartphone);
		
		smartphone.setName("-");
		spc.updateSmartphone(smartphone);
		
		Laptop laptop = new Laptop(24500.0,4,"DELL","PRECISION M70","Gray","Intel Pentium M 2.13GHz","2.00 GB DDR2",
				"60.0 GB HDD","Windows 7 Ultimate","15.4\" 1920x1200 Res.","NVIDIA Quadro™ FX Go1400",false,
				"Intel PRO/Wireless 2200 802.11b/g, 54Mbps; Dell Wireless 1370 802.11b/g; Dell Wireless 1470 802.11a/b/g",
				"CD-RW/DVD Combo;","-","-");
		
		LaptopController lc = new LaptopController();
		lc.saveLaptop(laptop);
		laptop.setId(3);
		lc.deleteLaptop(laptop);
		*/
		LoginController lgc = new LoginController();
		lgc.mostrarLogin();
	}
}