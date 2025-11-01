package ME1;

public class Main {

	public static void main(String[] args) {
		BookstoreCredit bc1 = new BookstoreCredit("Ellaine", 3.2);
		System.out.println(bc1.displayInfo(bc1.getName(), bc1.getGPA()));
	}

}
