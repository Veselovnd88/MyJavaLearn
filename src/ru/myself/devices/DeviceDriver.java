package ru.myself.devices;

public class DeviceDriver {


	public static void main(String[] args) {
		Device[] myarr = new Device[10];
		PressureTransducer pt1= new PressureTransducer("Pressure transducer", "801877", 0.1,100,"M20x1.5");
		myarr[0] = pt1;
		pt1.install(true);

		System.out.printf("%s%nInstallation status: %s%nMesurement: %f%n "
				, myarr[0], myarr[0].getInstall(), ((PressureTransducer) myarr[0]).measure());
	
	}

}
