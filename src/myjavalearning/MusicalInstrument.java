package myjavalearning;

import java.util.Calendar;

public class MusicalInstrument {
	private String name;
	private int type;
	private Dimensions dims;
	private double price;
	Calendar date;
	MusicalInstrument(String name, int type, double price,
	Calendar date, double l, double w, double h){
		setName(name);
		setType(type);
		setDims(new Dimensions(l,w,h));
		setPrice(price);
		setDate(date);
		Stat.counter++;
		
	}
	
	
	static class Stat{
		static int counter=0;
	}
	
	class Dimensions{
		Dimensions(){
			this(1,1,1);
		}
		Dimensions(double l, double w, double h){
			setLength(l);
			setWidth(w);
			setHeight(h);			
		}
		
		private double length,width, height;

		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = Math.max(1, length);
		}
		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = Math.max(1, width);
		}

		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = Math.max(1, height);
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Dimensions getDims() {
		return dims;
	}

	public void setDims(Dimensions dims) {
		this.dims = dims;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	@Override
	public String toString() {
		
		return getName();
	}

}
