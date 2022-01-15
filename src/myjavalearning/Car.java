package myjavalearning;

import java.time.LocalDate;
import java.time.Period;
import static java.lang.Math.min;
public class Car{
	public Car(){
		setGasoline(10);
	}// default constructor
	public Car(String name){
		this(name,0,0,false);}
	
	public Car(String name, int newspeed,int fuel, boolean eng ){
		setName(name);
		setSpeed(newspeed);
		setGasoline(fuel);
		setEngineState(eng);

	}
	private static final int MAX_SPEED=110;
	private String name;
	public void setPressure(int...pressures) {
		
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOdo() {
		return odo;
	}
	public void setOdo(int odo) {
		this.odo = odo;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		//if (engineState && (gasoline>0)) {
			if (speed<0) {
				System.out.println("Speed can't be negative, please try again, Speed set to Zero");
				this.speed = 0;}
			else {this.speed = min(speed, MAX_SPEED);
				
			}
	//}
		//else{
			//if (!engineState) {			
			//System.out.println("Please, start engine");
			//this.speed = 0;}
			//else {
			//	if (gasoline<=0) {
			//	System.out.println("Need more fuel");
			//	this.speed = 0;
			//}
		//}//}
		}
	public int getGasoline() {
		return gasoline;
	}
	public void setGasoline(int gasoline) {
		if (gasoline>300) {
			System.out.println("Too much gasoline, set to my max volume 300");
			this.gasoline = 300;
		}
		else {
		this.gasoline = gasoline;}
	}
	public boolean isEngineState() {
		return engineState;
	}
	public void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}
	public LocalDate getManufactured() {
		return manufactured;
	}
	public void setManufactured(LocalDate manufactured) {
		this.manufactured = manufactured;
	}
	
	public int getAge() {
		return Period.between(getManufactured(), LocalDate.now()).getYears();
	}
	private int odo;
	private int speed = 0;
	private int gasoline = 0;
	private boolean engineState = false;
	private LocalDate manufactured;
	
	public static void main(String[] args) {
		Car car_one = new Car();
		car_one.setManufactured(LocalDate.of(1970,05,05));	
		car_one.setOdo(143);
		System.out.printf("%s car was manufactured in %d%n",car_one.getName(),car_one.getManufactured().getYear()); int[] speedlist = new
				 int[] {10,2000,30,100,0,-5,-100,250}; for(int sp:speedlist) {
				 car_one.setSpeed(sp);
		System.out.println(car_one.getOdo());
		Car car2 = new Car("Crazy",70,100,true);
		System.out.println(car2.getSpeed());
		Car car3 = new Car();
		
		System.out.printf("%s car moves with speed %d and fuel level %d litres %n",car2.getName(),
				car2.getSpeed(), car2.getGasoline());
		System.out.printf("Car with %d gasoline %n", car3.getGasoline())	;

}}
}
