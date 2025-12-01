package patientBilling;

public class Patient extends Person {
	private String id;
	
	public Patient(String name, String id) {
		super(name);
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
}
