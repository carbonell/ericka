package models;

public class ProductRepairment {
	
	public ProductRepairment() {
	}
	
	public ProductRepairment(int id, Product product, String problem,
			Technician technician) {
		super();
		this.id = id;
		this.product = product;
		this.problem = problem;
		this.technician = technician;
	}

	public ProductRepairment(Product product, String problem,
			Technician technician) {
		super();
		this.id = 0;
		this.product = product;
		this.problem = problem;
		this.technician = technician;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public Technician getTechnician() {
		return technician;
	}

	public void setTechnician(Technician technician) {
		this.technician = technician;
	}

	private int id;
	private Product product;
	private String problem;
	private Technician technician;
}