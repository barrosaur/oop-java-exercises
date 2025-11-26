package drawableShape;

abstract class DrawableShape {
	protected int x, y;
	protected String color;
	
	public DrawableShape(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public String getColor() {
		return this.color;
	}
	
	abstract void moveObject(int dx, int dy);
}
