package drawableShape;

public class Test {

	public static void main(String[] args) {
		Square sq = new Square(5, 8, "Blue", 3);
		
		System.out.println("x: " + sq.getX());
		System.out.println("y: " + sq.getY());
		System.out.println("Color: " + sq.getColor());
		System.out.println("Side Length: " + sq.getSideLength());
		
		System.out.println("Perimeter: " + sq.computePerimeter());
		System.out.println("Area: " + sq.computeArea());
		
		System.out.println();
		System.out.println("Moving object...");
		
		sq.moveObject(4, 5);
		System.out.println("New coordinates");
		System.out.println("x: " + sq.getX());
		System.out.println("y: " + sq.getY());
	}

}
