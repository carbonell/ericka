package models;

import java.util.Date;

public class SmartphoneChange {
	
	public SmartphoneChange() {
	}
	
	public SmartphoneChange(int id, Date changeDate, String changeReason,
			SmartphoneSaleDetail smartphoneSale, Smartphone smartphoneGiven,
			int quantity) {
		super();
		this.id = id;
		this.changeDate = changeDate;
		this.changeReason = changeReason;
		this.smartphoneSale = smartphoneSale;
		this.smartphoneGiven = smartphoneGiven;
		this.quantity = quantity;
	}

	public SmartphoneChange(Date changeDate, String changeReason,
			SmartphoneSaleDetail smartphoneSale, Smartphone smartphoneGiven,
			int quantity) {
		super();
		this.id = 0;
		this.changeDate = changeDate;
		this.changeReason = changeReason;
		this.smartphoneSale = smartphoneSale;
		this.smartphoneGiven = smartphoneGiven;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getChangeDate() {
		return changeDate;
	}
	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}
	public String getChangeReason() {
		return changeReason;
	}
	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}
	public SmartphoneSaleDetail getSmartphoneSale() {
		return smartphoneSale;
	}
	public void setSmartphoneSale(SmartphoneSaleDetail smartphoneSale) {
		this.smartphoneSale = smartphoneSale;
	}
	public Smartphone getSmartphoneGiven() {
		return smartphoneGiven;
	}
	public void setSmartphoneGiven(Smartphone smartphoneGiven) {
		this.smartphoneGiven = smartphoneGiven;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	private int id;
	private Date changeDate;
	private String changeReason;
	private SmartphoneSaleDetail smartphoneSale;
	private Smartphone smartphoneGiven;
	private int quantity;
}