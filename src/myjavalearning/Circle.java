package myjavalearning;

public class Circle extends Shape implements TwoDimensional {
	private double radius;

	Circle(double r){
		setName("Unknown");
		setColor("White");
		setRadius(r);
	}
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}


	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [radius=");
		builder.append(radius);
		builder.append("]");
		return builder.toString();
	}
}
