package patientBilling;

public class Person {
	private String name;
	
	public Person() {
		this.name = "No name yet";
	}
	
	public Person(String initialName) {
		this.name = initialName;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void writeOutput() {
		System.out.println("Name: " + this.name);
	}
	
	public boolean hasSameName(Person otherPerson) {
		return this.name.equalsIgnoreCase(otherPerson.name);
	}
}
