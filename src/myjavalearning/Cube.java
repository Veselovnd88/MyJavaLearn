package myjavalearning;

public class Cube extends Box {
	public Cube(double a) {
	super(a);}

	@Override
	public void setHeight(double height) {
		if(height!=super.getHeight()) {
			super.setHeight(height);
			super.setWidth(height);
			super.setLength(height);}
			
	}

	@Override
	public void setWidth(double width) {
		if (width!=super.getWidth()) {
		super.setHeight(width);
		super.setWidth(width);
		super.setLength(width);}
	}

	@Override
	public void setLength(double length) {
		if(length!= super.getLength()) {
		super.setHeight(length);
		super.setWidth(length);
		super.setLength(length);}
	}
	
	
	
	public void setSide(double s) {
			if (s<=0) {
			System.out.println("Side must be greater than 0");}
			else {
			super.setHeight(Math.max(1.0, s));
			super.setWidth(Math.max(1.0, s));
			super.setLength(Math.max(1.0, s));
			}}


	public double getSide() {
		return super.getHeight();
	}
			

}
