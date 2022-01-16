package ru.myself.devices;

public class DeviceDriver {


	public static void main(String[] args) {
		Device[] myarr = new Device[10];
		PressureTransducer pt1= new PressureTransducer("Pressure transducer", "801877", 
				0.1,100,"M20x1.5");
		PressureGauge pt2 = new PressureGauge("Pressure gauge","010054",0.5, 30,"G1/2");
		myarr[0] = pt1;
		myarr[1] = pt2;
		pt1.install(true);
		
		for (Device d :myarr) {
		if (d!=null) {
			d.install(true);
		System.out.printf("%s%nInstallation status: %s%n"
				, d, d.getInstall());
		if(d instanceof PressureDevice) {
			System.out.printf("Mesurement: %f%n", ((PressureDevice) d).measure());
			System.out.printf("Overpressure: %f%n", ((PressureDevice) d).checkOverpressure());
		}
	}}
	}

}
