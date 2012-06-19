package controllers;

import models.Laptop;

public class Start {
	public static void main(String[] args) {
		LaptopController lc = new LaptopController();
		
		Laptop laptop = new Laptop(27500.0,4,"DELL","Inspiron 1545","Black","Intel Pentium 4 Dual Core 2.4GHz","2.00 GB DDR2",
				"160.0 GB HDD","Windows 7 Ultimate","15.4\" 1920x1200 Res.","NVIDIA Quadro™ FX Go1400",true,
				"Intel PRO/Wireless 2200 802.11b/g, 54Mbps; Dell Wireless 1370 802.11b/g; Dell Wireless 1470 802.11a/b/g",
				"CD-RW/DVD Combo;","-","-");
		
		lc.saveLaptop(laptop);
		
		//Laptop z = lc.getSingleLaptop(4);
	}
}