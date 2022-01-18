package ru.myself.devices;

import java.util.Arrays;
import java.util.List;

public class DeviceDriver {


	public static void main(String[] args) {
		Device[] myarr = new Device[10];
		PressureTransducer pt1= new PressureTransducer("Pressure transducer", "801877", 
				0.1,100,"M20x1.5");
		PressureGauge pt2 = new PressureGauge("Pressure gauge","010054",0.5, 30,"G1/2");
		myarr[0] = pt1;
		myarr[1] = pt2;
		pt1.install(true);
		
//		for (Device d :myarr) {
//		if (d!=null) {
//			d.install(true);
//		System.out.printf("%s%nInstallation status: %s%n"
//				, d, d.getInstall());
//		if(d instanceof PressureDevice) {
//			System.out.printf("Mesurement: %f%n", ((PressureDevice) d).measure());
//			System.out.printf("Overpressure: %f%n", ((PressureDevice) d).checkOverpressure());
//		}
//	}}
		MeasuringDevice[] arr2 = new MeasuringDevice[2];
		arr2[0] = pt1;
		arr2[1] = pt2;
		List<MeasuringDevice> mylist = Arrays.asList(pt1,pt2);
		mylist.forEach(MeasuringDevice::setToZero);
		
		pt1.setCurrentValue(100.0);
		MeasuringDevice.setToZero(pt1);
		for(MeasuringDevice md:arr2) {
			System.out.printf("Mesurement: %f%n", ((PressureDevice) md).getCurrentValue());
			System.out.printf("Overpressure: %f%n", ((PressureDevice) md).checkOverpressure());
		}
		
	}

}
