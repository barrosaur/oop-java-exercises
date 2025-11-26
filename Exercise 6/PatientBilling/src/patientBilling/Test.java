package patientBilling;

public class Test {

	public static void main(String[] args) {
		Doctor doc1 = new Doctor("Ell", "General Practitioner", 1500.00);
		Doctor doc2 = new Doctor("Josh", "Pediatrician", 1.00);
		Doctor doc3 = new Doctor("Ell", "General Practitioner", 1500.00);
		
		doc1.writeOutput();
		System.out.println(doc1.getFee());
		System.out.println(doc1.getSpecialty());
		
		System.out.println();
		
		doc2.writeOutput();
		System.out.println(doc2.getFee());
		System.out.println(doc2.getSpecialty());
		
		System.out.println(doc1.equals(doc2));
		System.out.println(doc1.equals(doc3));

	}

}
