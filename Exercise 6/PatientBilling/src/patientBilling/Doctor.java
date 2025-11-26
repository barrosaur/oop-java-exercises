package patientBilling;

public class Doctor extends Person {
	private String specialty;
	private double officeVisitFee;
	
	public Doctor(String name, String specialty, double fee) {
		super(name);
		this.specialty = specialty;
		this.officeVisitFee = fee;
	}
	
	public Doctor() {
		this.setName("John Doe");
		this.specialty = null;
		this.officeVisitFee = 0.00;
	}
	
	public String getSpecialty() {
		return this.specialty;
	}
	
	public double getFee() {	
		return this.officeVisitFee;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		Doctor otherDoc = (Doctor) obj;
		return this.hasSameName(otherDoc) &&
			   (this.getSpecialty().equalsIgnoreCase(otherDoc.getSpecialty())) &&
			   (this.getFee() == otherDoc.getFee());
	}
}
