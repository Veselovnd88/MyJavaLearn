package myjavalearning;

public class Box {
	public Box(double h, double w, double l) {// constructor with 3 params
		setHeight(h);
		setWidth(w);
		setLength(l);
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
	
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	public static void main(String[] args) {
		
		Box box1 = new Box(5);
		box1.printBox();
		System.out.println(box1.getSurfaceArea());
		
	}
}
