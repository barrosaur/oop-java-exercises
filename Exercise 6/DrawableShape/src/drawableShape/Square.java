package drawableShape;

public class Square extends DrawableShape {
	private int length_sides;
	
	public Square(int x, int y, String color, int length_sides) {
		super(x, y, color);
		this.length_sides = length_sides;
	}
	
	@Override
	void moveObject(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public int getSideLength() {
		return this.length_sides;
	}
	
	public void setSideLength(int length_side) {
		this.length_sides = length_side;
	}
	
	public int computePerimeter() {
		return this.length_sides * 4;
	}
	
	public int computeArea() {
		return this.length_sides * this.length_sides;
	}
}
