package PlayingWClasses;

public class Cat {
	//TODO 5 constructors
	//1 with name only
	//2 name, age, weight
	//3 name, age (standard
	//weight, colour
	//weigth, age, colour, strength, address (full)
	Cat(String name,int age, int weight, int strength){
		setName(name);
		setAge(age);
		setWeight(weight);
		setStrength(strength);
	}
	
	private String name;
	private int age;
	private int weight;
	private int strength;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public boolean fight (Cat anotherCat) {
		return (this.weight+this.strength)> (anotherCat.weight+anotherCat.strength);
	}

}
