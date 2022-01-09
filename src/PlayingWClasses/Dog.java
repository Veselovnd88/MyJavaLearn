package PlayingWClasses;

public class Dog {
	
	Dog(String name, int height, String color){
		setName(name);
		setHeight(height);
		setColor(color);
		dogCount++;
	}
	Dog(String name){
		this(name,AVG_HEIGHT,AVG_COLOR);
	}
	Dog(String name, int height){
		this(name,height,AVG_COLOR);
	}
	public void bark() {
		System.out.printf("%s dog %s barked%n", getColor(),getName());
	}
	protected void finalize() throws Throwable{
		dogCount--;
		System.out.println("Object " + name+ " destroyed, "+dogCount+" left.");
		
	}
	private String name;
	private int height;
	private String color;
	private final static int AVG_HEIGHT = 15;
	private final static String AVG_COLOR = "Brown";
	private static int dogCount = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name==""|| name==null) {
			this.name=null;
		}
		this.name = name;
	}
	public int getHeight() {
		
		return height;
	}
	public void setHeight(int height) {
		if (height<=0) {
			this.height = AVG_HEIGHT;
			System.out.println("Height must be greater than zero, set to average");
		}
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		if(color==""||color==null) {
			this.color=AVG_COLOR;
		}
		else {
		this.color = color;}
	}
	public static int getDogCount() {
		return dogCount;
	}
	public static void setDogCount(int dogCount) {
		Dog.dogCount = dogCount;
	}
}
