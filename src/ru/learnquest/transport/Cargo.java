package ru.learnquest.transport;

public class Cargo extends Car {
	public Cargo() {
		super();
	}
	public Cargo(String name) {
		super(name);
	}
	public Cargo(String name, int newspeed, int fuel, boolean eng) {
		super(name, newspeed, fuel, eng);
	}
	private int cargoCapacity;
	private int cargoLoad;
	public void setCargoLoad(int cargoLoad) {
		this.cargoLoad = cargoLoad;
	}
	@Override
	public void setSpeed(int speed) {
		super.setSpeed(speed =getCargoLoad()/100);
	}

	public int getCargoLoad() {
		return cargoLoad;
	}
}