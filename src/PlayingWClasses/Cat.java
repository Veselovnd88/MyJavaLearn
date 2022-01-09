package PlayingWClasses;

public class Cat {
	
	Cat(String name,int age, String color, int weight, int strength, String address){
		setName(name);
		setAge(age);
		setWeight(weight);
		setStrength(strength);
		setColor(color);
		setAddress(address);
	}
	Cat(String name){
		this(name,5,"Grey",5,5,"Unknown");
	}
	Cat(String name, int age,int weight){
		this(name,age,"Grey",weight,5, "Unknown");
	}
	Cat(String name, int age, String color,int weight){
		this(name,age,color,weight,5,"Uknown");
	}
	
	private String name;
	private String color;
	

	private String address;
	private int age;
	private int weight;
	private int strength;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;//TODO если имя пустая строка - то передавать нулл
	}
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
		this.address = address;//TODO если адрес пустой - то передавать нулл
	}
	public boolean fight (Cat anotherCat) {
		return (this.weight+this.strength)> (anotherCat.weight+anotherCat.strength);
	}

}
