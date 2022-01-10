package ru.learnquest.transport;

public class sUV extends Cargo {

	public sUV() {
	}

	public sUV(String name) {
		super(name);
	}

	public sUV(String name, int newspeed, int fuel, boolean eng) {
		super(name, newspeed, fuel, eng);
	}

}
