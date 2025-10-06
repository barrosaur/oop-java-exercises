package exercise3;

public class Rectangle {
	private double height, width;
	
	public Rectangle() {
		this.height = 1;
		this.width = 1;
	}
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return height * width;
	}
	
	public double getPerimeter() {
		return 2 * (height + width);
	}
}
