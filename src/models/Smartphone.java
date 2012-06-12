package models;

public class Smartphone extends Product {
	
	public Smartphone() {
	}
	
	public Smartphone(int id, double price, int stock, String brand, String model, String name, String color,
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return this.stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStoragecapacity() {
		return storagecapacity;
	}
	public void setStoragecapacity(String storagecapacity) {
		this.storagecapacity = storagecapacity;
	}
	public String getNetworkstandards() {
		return networkstandards;
	}
	public void setNetworkstandards(String networkstandards) {
		this.networkstandards = networkstandards;
	}
	public String getScreenwidth() {
		return screenwidth;
	}
	public void setScreenwidth(String screenwidth) {
		this.screenwidth = screenwidth;
	}
	public String getScreenheight() {
		return screenheight;
	}
	public void setScreenheight(String screenheight) {
		this.screenheight = screenheight;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getVideorecording() {
		return videorecording;
	}
	public void setVideorecording(String videorecording) {
		this.videorecording = videorecording;
	}
	public String getOperativesystem() {
		return operativesystem;
	}
	public void setOperativesystem(String operativesystem) {
		this.operativesystem = operativesystem;
	}
	public String getOsversion() {
		return osversion;
	}
	public void setOsversion(String osversion) {
		this.osversion = osversion;
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
	public String getOtherfeatures() {
		return otherfeatures;
	}
	public void setOtherfeatures(String otherfeatures) {
		this.otherfeatures = otherfeatures;
	}
	public boolean isTouchcapable() {
		return touchcapable;
	}
	public void setTouchcapable(boolean touchcapable) {
		this.touchcapable = touchcapable;
	}
	public boolean isGpscapable() {
		return gpscapable;
	}
	public void setGpscapable(boolean gpscapable) {
		this.gpscapable = gpscapable;
	}
	public boolean isWificapable() {
		return wificapable;
	}
	public void setWificapable(boolean wificapable) {
		this.wificapable = wificapable;
	}
	public boolean isBluetoothcapable() {
		return bluetoothcapable;
	}
	public void setBluetoothcapable(boolean bluetoothcapable) {
		this.bluetoothcapable = bluetoothcapable;
	}
	public boolean isInfraredcapable() {
		return infraredcapable;
	}
	public void setInfraredcapable(boolean infraredcapable) {
		this.infraredcapable = infraredcapable;
	}
	public boolean isQwertykeyboard() {
		return qwertykeyboard;
	}
	public void setQwertykeyboard(boolean qwertykeyboard) {
		this.qwertykeyboard = qwertykeyboard;
	}
	public boolean isFlashcapable() {
		return flashcapable;
	}
	public void setFlashcapable(boolean flashcapable) {
		this.flashcapable = flashcapable;
	}
	
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