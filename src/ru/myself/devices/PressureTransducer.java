package ru.myself.devices;

public class PressureTransducer extends PressureDevice {

	public PressureTransducer(String type, String article,double weight, double range, String conn) {
		super(type, article, weight,range,conn);
		
	}



	@Override
	public double checkOverpressure() {
		return super.getRange()*3;
	}




	

}
