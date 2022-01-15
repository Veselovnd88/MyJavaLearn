package ru.myself.devices;

public class DeviceDriver {


	public static void main(String[] args) {
		Device[] myarr = new Device[10];
		myarr[0] = new PressureTransducer("Pressure transducer", "801877", 0.1,100,"M20x1.5");
		System.out.println(myarr[0]);
	}

}
