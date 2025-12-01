package patientBilling;

public class Test {

	public static void main(String[] args) {
		Doctor doc1 = new Doctor("Ell", "General Practitioner", 1500.00);
		Doctor doc2 = new Doctor("Josh", "Pediatrician", 1.00);
		Doctor doc3 = new Doctor("Ell", "General Practitioner", 1500.00);
		Patient p1 = new Patient("Mark", "1");
		Patient p2 = new Patient("Trump", "2");
		Patient p3 = new Patient("Etho", "3");
		
		Billing b1 = new Billing(p1, doc1);
		Billing b2 = new Billing(p2, doc2);
		
		doc1.writeOutput();
		System.out.println(doc1.getFee());
		System.out.println(doc1.getSpecialty());
		
		System.out.println();
		
		doc2.writeOutput();
		System.out.println(doc2.getFee());
		System.out.println(doc2.getSpecialty());
		
		System.out.println(doc1.equals(doc2));
		System.out.println(doc1.equals(doc3));

		System.out.println("\n================================================");
		System.out.println("Doctor 1: " + b1.getDoctor().getName());
		System.out.println("Doctor 1 Fee: " + b1.getDoctor().getFee());
		System.out.println("Doctor 1 Specialty: " + b1.getDoctor().getSpecialty());
		System.out.println("Patient 1: " + b1.getPatient().getName());
		System.out.println("Patient 1 id: " + b1.getPatient().getId());
		
		System.out.println("\n================================================");
		System.out.println("Doctor 2: " + b2.getDoctor().getName());
		System.out.println("Doctor 2 Fee: " + b2.getDoctor().getFee());
		System.out.println("Doctor 2 Specialty: " + b2.getDoctor().getSpecialty());
		System.out.println("Patient 2: " + b2.getPatient().getName());
		System.out.println("Patient 2 id: " + b2.getPatient().getId());
	}

}
