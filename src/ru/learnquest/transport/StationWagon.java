package ru.learnquest.transport;

public class StationWagon extends Cargo {

	public StationWagon() {
		super();
	}

	public StationWagon(String name) {
		super(name);
	}

	public StationWagon(String name, int newspeed, int fuel, boolean eng) {
		super(name, newspeed, fuel, eng);
	}

}
