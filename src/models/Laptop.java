package models;

public class Laptop extends Product {
	
	public Laptop() {
	}
	
	public Laptop(int id, double price, int stock, Laptop laptop, String brand, String model, String color,
			String processor, String ram, String hdd, String os, String screen,
			String videoCard, boolean hasCamera, String wirelessConectivity,
			String mediaRecording, String mediaCardReading, String otherFeatures) {
		super();
		this.id = id;
		this.price = price;
		this.stock = stock;
		this.laptop = laptop;
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
	
	public Laptop(double price, int stock, Laptop laptop, String brand, String model, String color,
			String processor, String ram, String hdd, String os, String screen,
			String videoCard, boolean hasCamera, String wirelessConectivity,
			String mediaRecording, String mediaCardReading, String otherFeatures) {
		super();
		this.id = 0;
		this.price = price;
		this.stock = stock;
		this.laptop = laptop;
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getVideoCard() {
		return videoCard;
	}

	public void setVideoCard(String videoCard) {
		this.videoCard = videoCard;
	}

	public boolean isHasCamera() {
		return hasCamera;
	}

	public void setHasCamera(boolean hasCamera) {
		this.hasCamera = hasCamera;
	}

	public String getWirelessConectivity() {
		return wirelessConectivity;
	}

	public void setWirelessConectivity(String wirelessConectivity) {
		this.wirelessConectivity = wirelessConectivity;
	}

	public String getMediaRecording() {
		return mediaRecording;
	}

	public void setMediaRecording(String mediaRecording) {
		this.mediaRecording = mediaRecording;
	}

	public String getMediaCardReading() {
		return mediaCardReading;
	}

	public void setMediaCardReading(String mediaCardReading) {
		this.mediaCardReading = mediaCardReading;
	}

	public String getOtherFeatures() {
		return otherFeatures;
	}

	public void setOtherFeatures(String otherFeatures) {
		this.otherFeatures = otherFeatures;
	}
	
	private Laptop laptop;
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