package ru.learnquest.transport;

public class SportCar extends Car {

	public SportCar() {
	}

	public SportCar(String name) {
		super(name);
	}
	public SportCar(String name, int newspeed, int fuel, boolean eng) {
		super(name, newspeed, fuel, eng);
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		super.setSpeed((int)(speed*1.10));
	}

	
	
}
