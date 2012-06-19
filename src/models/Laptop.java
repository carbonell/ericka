package models;

import javax.persistence.*;

@Entity
@Table(name="laptop")
public class Laptop implements Product {
	
	public Laptop() {
	}
	
	public Laptop(long id, double price, int stock, String brand, String model, String color,
			String processor, String ram, String hdd, String os, String screen,
			String videoCard, boolean hasCamera, String wirelessConectivity,
			String mediaRecording, String mediaCardReading, String otherFeatures) {
		super();
		this.id = id;
		this.price = price;
		this.stock = stock;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.processor = processor;
		this.ram = ram;
		this.hdd = hdd;
		this.os = os;
		this.screen = screen;
		this.videoCard = videoCard;
		this.hasCamera = hasCamera;
		this.wirelessConectivity = wirelessConectivity;
		this.mediaRecording = mediaRecording;
		this.mediaCardReading = mediaCardReading;
		this.otherFeatures = otherFeatures;
	}
	
	public Laptop(double price, int stock, String brand, String model, String color,
			String processor, String ram, String hdd, String os, String screen,
			String videoCard, boolean hasCamera, String wirelessConectivity,
			String mediaRecording, String mediaCardReading, String otherFeatures) {
		super();
		this.id = 0;
		this.price = price;
		this.stock = stock;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.processor = processor;
		this.ram = ram;
		this.hdd = hdd;
		this.os = os;
		this.screen = screen;
		this.videoCard = videoCard;
		this.hasCamera = hasCamera;
		this.wirelessConectivity = wirelessConectivity;
		this.mediaRecording = mediaRecording;
		this.mediaCardReading = mediaCardReading;
		this.otherFeatures = otherFeatures;
	}
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	
	@Column
	public double getPrice() {
		return price;
	}
	
	@Column
	public int getStock() {
		return stock;
	}
	
	@Column
	public String getBrand() {
		return brand;
	}
	
	@Column
	public String getModel() {
		return model;
	}
	
	@Column
	public String getColor() {
		return color;
	}

	@Column
	public String getProcessor() {
		return processor;
	}

	@Column
	public String getRam() {
		return ram;
	}

	@Column
	public String getHdd() {
		return hdd;
	}

	@Column
	public String getOs() {
		return os;
	}

	@Column
	public String getScreen() {
		return screen;
	}

	@Column
	public String getVideoCard() {
		return videoCard;
	}

	@Column(name="builtincamera")
	public boolean isHasCamera() {
		return hasCamera;
	}

	@Column
	public String getWirelessConectivity() {
		return wirelessConectivity;
	}

	@Column
	public String getMediaRecording() {
		return mediaRecording;
	}

	@Column(name="mediacardreader")
	public String getMediaCardReading() {
		return mediaCardReading;
	}

	@Column
	public String getOtherFeatures() {
		return otherFeatures;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public void setVideoCard(String videoCard) {
		this.videoCard = videoCard;
	}

	public void setHasCamera(boolean hasCamera) {
		this.hasCamera = hasCamera;
	}

	public void setWirelessConectivity(String wirelessConectivity) {
		this.wirelessConectivity = wirelessConectivity;
	}

	public void setMediaRecording(String mediaRecording) {
		this.mediaRecording = mediaRecording;
	}

	public void setMediaCardReading(String mediaCardReading) {
		this.mediaCardReading = mediaCardReading;
	}

	public void setOtherFeatures(String otherFeatures) {
		this.otherFeatures = otherFeatures;
	}
	
	private long id;
	private double price;
	private int stock;
	private String brand;
	private String model;
	private String color;
	private String processor;
	private String ram;
	private String hdd;
	private String os;
	private String screen;
	private String videoCard;
	private boolean hasCamera;
	private String wirelessConectivity;
	private String mediaRecording;
	private String mediaCardReading;
	private String otherFeatures;
}