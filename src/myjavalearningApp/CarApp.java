package myjavalearningApp;

import java.time.LocalDate;

import myjavalearning.Car;

public class CarApp{
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
