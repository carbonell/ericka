package models;

public class MoneyInput {
	
	public MoneyInput() {
	}
	
	public MoneyInput(int id, double amount, String description) {
		super();
		this.id = id;
		this.amount = amount;
		this.description = description;
	}

	public MoneyInput(double amount, String description) {
		super();
		this.id = 0;
		this.amount = amount;
		this.description = description;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	private int id;
	private double amount;
	private String description;
}
