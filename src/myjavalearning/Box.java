package myjavalearning;

public class Box {
	public Box(double h, double w, double l) {// constructor with 3 params

		setHeight(Math.max(1.0,h));
		setWidth(Math.max(1.0,2));
		setLength(Math.max(1.0,l));
	}
	public Box(double a) { //construsuctor with 1 param, inside we invoke first constutor for reuse the code.
		this(a,a,a);//creating a cube
	}
	
	public double getVolume() {
		return height*width*length;
	}
	public double getSurfaceArea() {
		return (height*width*2+width*length*2+length*height*2);
	}
	public void printBox() {
		if(height<=0||width<=0||length<0) {
			System.out.println("The box contains invalid properties");
		}
		else {
			System.out.println("Length = "+length);
			System.out.println("Width = "+width);
			System.out.println("Height = "+height);
			System.out.println("Volume is "+getVolume());
			System.out.println("Area is "+getSurfaceArea());
			
		}
		
	}
	
	
	private double height;
	private double width;
	private double length;
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		if (height>0) {
		this.height = height;}
		else {
			System.out.println("Height must be greater than 0");
			
		}
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width>0) {
		this.width = width;}
		else {
			System.out.println("Height must greater than 0");
			
		}
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		if (length>0) {
		this.length = length;}
		else {
			System.out.println("Length must be greater than 0");
			
		}
	}
	}
