package ru.learnquest.transport;

public class StationWagon extends Car {

	public StationWagon() {
	}

	public StationWagon(String name) {
		super(name);
	}

	public StationWagon(String name, int newspeed, int fuel, boolean eng) {
		super(name, newspeed, fuel, eng);
	}
		public void setCargoLoad(int cargoLoad) {
		this.cargoLoad = cargoLoad;
	}
	
	
	private int cargoCapacity;
	private int cargoLoad;
	
	@Override
	public void setSpeed(int speed) {
		super.setSpeed(speed = cargoLoad/100);
	}

}
