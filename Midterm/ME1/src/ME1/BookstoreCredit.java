package ME1;

public class BookstoreCredit {
	private double gpa;
	private double credit;
	private String name;
	
	public BookstoreCredit() {
		this.gpa = 0;
		this.name = "";
		this.credit = 0;
	}
	
	public BookstoreCredit(String name, double gpa) {
		this.gpa = gpa;
		this.name = name;
		this.credit = calcCredit(gpa);
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public double getCredit() {
		return this.credit;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double calcCredit(double gpa) {
		return gpa*75;
	}
	
	public String displayInfo(String name, double gpa) {
		return "Name: " + name + "\nGrade Point Average: " + gpa + "\nCredit: " + this.getCredit();
	}
}
