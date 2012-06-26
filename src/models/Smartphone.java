package models;

import javax.persistence.*;

@Entity
@Table(name="smartphone")
public class Smartphone implements Product {
	
	public Smartphone() {
	}
	
	public Smartphone(long id, double price, int stock, String brand, String model, String name, String color,
			String storagecapacity, String networkstandards,
			String screenwidth, String screenheight, String camera,
			String videorecording, String operativesystem, String osversion,
			String processor, String ram, String otherfeatures,
			boolean touchcapable, boolean gpscapable, boolean wificapable,
			boolean bluetoothcapable, boolean infraredcapable,
			boolean qwertykeyboard, boolean flashcapable) {
		super();
		this.id = id;
		this.price = price;
		this.stock = stock;
		this.brand = brand;
		this.model = model;
		this.name = name;
		this.color = color;
		this.storagecapacity = storagecapacity;
		this.networkstandards = networkstandards;
		this.screenwidth = screenwidth;
		this.screenheight = screenheight;
		this.camera = camera;
		this.videorecording = videorecording;
		this.operativesystem = operativesystem;
		this.osversion = osversion;
		this.processor = processor;
		this.ram = ram;
		this.otherfeatures = otherfeatures;
		this.touchcapable = touchcapable;
		this.gpscapable = gpscapable;
		this.wificapable = wificapable;
		this.bluetoothcapable = bluetoothcapable;
		this.infraredcapable = infraredcapable;
		this.qwertykeyboard = qwertykeyboard;
		this.flashcapable = flashcapable;
	}
	
	public Smartphone(double price, int stock, String brand, String model, String name, String color,
			String storagecapacity, String networkstandards,
			String screenwidth, String screenheight, String camera,
			String videorecording, String operativesystem, String osversion,
			String processor, String ram, String otherfeatures,
			boolean touchcapable, boolean gpscapable, boolean wificapable,
			boolean bluetoothcapable, boolean infraredcapable,
			boolean qwertykeyboard, boolean flashcapable) {
		super();
		this.id = 0;
		this.price = price;
		this.stock = stock;
		this.brand = brand;
		this.model = model;
		this.name = name;
		this.color = color;
		this.storagecapacity = storagecapacity;
		this.networkstandards = networkstandards;
		this.screenwidth = screenwidth;
		this.screenheight = screenheight;
		this.camera = camera;
		this.videorecording = videorecording;
		this.operativesystem = operativesystem;
		this.osversion = osversion;
		this.processor = processor;
		this.ram = ram;
		this.otherfeatures = otherfeatures;
		this.touchcapable = touchcapable;
		this.gpscapable = gpscapable;
		this.wificapable = wificapable;
		this.bluetoothcapable = bluetoothcapable;
		this.infraredcapable = infraredcapable;
		this.qwertykeyboard = qwertykeyboard;
		this.flashcapable = flashcapable;
	}

	@Override
	public String toString() {
		return this.getName();
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
	public String getName() {
		return name;
	}

	@Column
	public String getColor() {
		return color;
	}

	@Column
	public String getStoragecapacity() {
		return storagecapacity;
	}

	@Column
	public String getNetworkstandards() {
		return networkstandards;
	}

	@Column
	public String getScreenwidth() {
		return screenwidth;
	}

	@Column
	public String getScreenheight() {
		return screenheight;
	}

	@Column
	public String getCamera() {
		return camera;
	}

	@Column
	public String getVideorecording() {
		return videorecording;
	}

	@Column
	public String getOperativesystem() {
		return operativesystem;
	}

	@Column
	public String getOsversion() {
		return osversion;
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
	public String getOtherfeatures() {
		return otherfeatures;
	}

	@Column(name="TouchCapability")
	public boolean isTouchcapable() {
		return touchcapable;
	}

	@Column(name="GPSCapability")
	public boolean isGpscapable() {
		return gpscapable;
	}

	@Column(name="WiFiCapability")
	public boolean isWificapable() {
		return wificapable;
	}

	@Column(name="BluetoothCapability")
	public boolean isBluetoothcapable() {
		return bluetoothcapable;
	}

	@Column(name="InfraredCapability")
	public boolean isInfraredcapable() {
		return infraredcapable;
	}

	@Column
	public boolean isQwertykeyboard() {
		return qwertykeyboard;
	}

	@Column(name="FlashCapability")
	public boolean isFlashcapable() {
		return flashcapable;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setStoragecapacity(String storagecapacity) {
		this.storagecapacity = storagecapacity;
	}

	public void setNetworkstandards(String networkstandards) {
		this.networkstandards = networkstandards;
	}

	public void setScreenwidth(String screenwidth) {
		this.screenwidth = screenwidth;
	}

	public void setScreenheight(String screenheight) {
		this.screenheight = screenheight;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public void setVideorecording(String videorecording) {
		this.videorecording = videorecording;
	}

	public void setOperativesystem(String operativesystem) {
		this.operativesystem = operativesystem;
	}

	public void setOsversion(String osversion) {
		this.osversion = osversion;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public void setOtherfeatures(String otherfeatures) {
		this.otherfeatures = otherfeatures;
	}

	public void setTouchcapable(boolean touchcapable) {
		this.touchcapable = touchcapable;
	}

	public void setGpscapable(boolean gpscapable) {
		this.gpscapable = gpscapable;
	}

	public void setWificapable(boolean wificapable) {
		this.wificapable = wificapable;
	}

	public void setBluetoothcapable(boolean bluetoothcapable) {
		this.bluetoothcapable = bluetoothcapable;
	}

	public void setInfraredcapable(boolean infraredcapable) {
		this.infraredcapable = infraredcapable;
	}

	public void setQwertykeyboard(boolean qwertykeyboard) {
		this.qwertykeyboard = qwertykeyboard;
	}

	public void setFlashcapable(boolean flashcapable) {
		this.flashcapable = flashcapable;
	}

	private long id;
	private double price;
	private int stock;
	private String brand;
	private String model;
	private String name;
	private String color;
	private String storagecapacity;
	private String networkstandards;
	private String screenwidth;
	private String screenheight;
	private String camera;
	private String videorecording;
	private String operativesystem;
	private String osversion;
	private String processor;
	private String ram;
	private String otherfeatures;
	private boolean touchcapable;
	private boolean gpscapable;
	private boolean wificapable;
	private boolean bluetoothcapable;
	private boolean infraredcapable;
	private boolean qwertykeyboard;
	private boolean flashcapable;
}