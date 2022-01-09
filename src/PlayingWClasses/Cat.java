package PlayingWClasses;
import java.util.ArrayList;
public class Cat {
	
	Cat(String name,int age, String color, int weight, int strength, String address){
		setName(name);
		setAge(age);
		setWeight(weight);
		setStrength(strength);
		setColor(color);
		setAddress(address);
		catCount++;
		cats.add(this);
		System.out.println(catCount+ " cats created");
	}
	Cat(String name){
		this(name,AVG_AGE,"Grey",AVG_WEIGHT,AVG_STRENGTH,null);
	}
	Cat(String name, int age,int weight){
		this(name,age,"Grey",weight,AVG_STRENGTH, "");
	}
	Cat(String name, int age, String color,int weight){
		this(name,age,color,weight,AVG_STRENGTH,null);
	}
	public boolean fight (Cat anotherCat) {
		return (this.weight+this.strength)> (anotherCat.weight+anotherCat.strength);
	}
	protected void finalize() throws Throwable{
		//System.out.println("Object "+ name+" destroyed");
	catCount--;
	System.out.println(catCount+" cats left");
	}
	public static ArrayList<Cat> cats=new ArrayList<Cat>();
	private static int catCount=0;
	private String name;
	private String color;
	private final  static int AVG_AGE = 5;
	private final static int AVG_WEIGHT = 3;
	private final static int AVG_STRENGTH = 5;
	private String address;
	private int age;
	private int weight;
	private int strength;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name=="" || name==null) {
			this.name=null;
		}
		else {
		this.name = name;
	}}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0||age>25) {
			System.out.println("Age should be between 0 and 25 years, set to 0");
			this.age = 0;
		}
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight<1||weight>50) {
			System.out.println("Weight should be between 0 and 50 ks, set to 1");
		}
		this.weight = weight;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address=="" || address==null) {
			this.address=null;
		}
		else {
		this.address = address;}
	}
	public static int getCatCount() {
		return catCount;
	}
	/*public static void setCatCount(int catCount) {
		Cat.catCount = catCount;
	}*/
	

}
