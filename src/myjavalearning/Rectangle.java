package myjavalearning;

public class Rectangle extends Shape implements TwoDimensional {
	
	public Rectangle(double length, double width) {
		setName("Unknown");
		setColor("White");
		setLength(length);
		setWidth(width);
	}
	public Rectangle(String name, String color, double length, double width) {
		setName(name);
		setColor(color);
		setLength(length);
		setWidth(width);
	}
		@Override
	public double getArea() {
		
		return length*width;
	}
	@Override
	public double getPerimeter() {
				return 2*(length+width);
	}
	
	
	
	
	
	private double length;
	private double width;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

}
