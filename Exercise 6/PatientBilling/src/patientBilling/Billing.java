package patientBilling;

public class Billing {
	private Patient p;
	private Doctor d;
	
	public Billing(Patient p, Doctor d) {
		this.p = p;
		this.d = d;
	}
	
	public Patient getPatient() {
		return this.p;
	}
	
	public Doctor getDoctor() {
		return this.d;
	}
	
	public void setPatient(Patient p) {
		this.p = p;
	}
	
	public void setDoctor(Doctor d) {
		this.d = d;
	}
	
	public double getFee() {
		return d.getFee();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		Billing otherObj = (Billing) obj;
		return this.p.equals(otherObj.p) && this.d.equals(otherObj.d);
	}
}
