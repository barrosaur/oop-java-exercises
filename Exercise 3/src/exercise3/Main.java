package exercise3;

public class Main {

	public static void main(String[] args) {
		System.out.println("------------------- LE31 --------------");
		Person personOne = new Person("Ell", 19);
		Person personTwo = new Person("Gem", 27);
		Person personThree = new Person("Ell", 20);
		
		System.out.println(personOne.isYounger(personTwo));
		System.out.println(personTwo.isYounger(personOne));
		System.out.println(personOne.sameName(personThree));
		System.out.println(personOne.sameAge(personTwo));
		System.out.println(personOne.samePerson(personThree));
		System.out.println("---------------------------------------");
		
		System.out.println();
		
		System.out.println("------------------- LE32 --------------");
		Rectangle rect1 = new Rectangle(40, 4);
		Rectangle rect2 = new Rectangle(35.9, 3.5);
		
		System.out.println("Rectangle 1 height: " + rect1.getHeight());
		System.out.println("Rectangle 1 width: " + rect1.getWidth());
		System.out.println("Rectangle 1 area: " + rect1.getArea());
		System.out.println("Rectangle 1 permieter: " + rect1.getPerimeter());
		
		System.out.println();
		
		System.out.println("Rectangle 2 height: " + rect2.getHeight());
		System.out.println("Rectangle 2 width: " + rect2.getWidth());
		System.out.println("Rectangle 2 area: " + rect2.getArea());
		System.out.println("Rectangle 2 permieter: " + rect2.getPerimeter());
		System.out.println("---------------------------------------");
		
		System.out.println();
		
		System.out.println("------------------- LE33 --------------");
		GradeDistribution gd1 = new GradeDistribution();
		gd1.setGrade(40, 75, 50, 80, 90);
		gd1.drawBarGrade();
		System.out.println("---------------------------------------");
	}

}
