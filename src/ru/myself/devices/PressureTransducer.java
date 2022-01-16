package ru.myself.devices;

public class PressureTransducer extends PressureDevice {

	public PressureTransducer(String type, String article,double weight, double range, String conn) {
		super(type, article, weight,range,conn);
		
	}

	@Override
	public double measure() {
		if (super.getInstall()) {
			return (super.getWeight()*90/super.getRange());
		}
		else return 0;
	}

	@Override
	public double checkOverpressure() {
		return super.getRange()*3;
	}
	

}
