package myjavalearning;

public class Properties {
	
	
	Properties(){
		this(0,"Basic",0,0,0);
	}
	
	Properties(double lineSize,String type,
			int red, int green, int blue){
	setLineSize(lineSize);
	setType(type);
	setColor(new Color(red,green,blue));	
	Stat.counter++;
	}
	
	private double lineSize;
	private String type;
	private Color color;
	
	static class Stat {
		public static int counter=0;
	}
	public class Color{
	
		Color(int red, int green, int blue){
		setRed(red);
		setGreen(green);
		setBlue(blue);
		}
		private int red;
		private int green;
		private int blue;
		
		public int getRed() {
			return red;
		}
		
		public void setRed(int red) {
			this.red = red;
		}
		
		public int getGreen() {
			return green;
		}
		
		public void setGreen(int green) {
			this.green = green;
		}
		
		public int getBlue() {
			return blue;
		}
		
		public void setBlue(int blue) {
			this.blue = blue;
		}
		
	}

	
	
	
	public double getLineSize() {
		return lineSize;
	}

	
	public void setLineSize(double lineSize) {
		this.lineSize = lineSize;
	}

		public String getType() {
		return type;
	}

	
	public void setType(String type) {
		this.type = type;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}

}
