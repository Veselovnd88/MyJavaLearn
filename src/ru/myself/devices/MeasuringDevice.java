package ru.myself.devices;

public interface MeasuringDevice {
	
	public double measureTest();
	public double checkOverpressure();
	public default double getCurrentValue() {
	
	
	return measureTest();}
	public  void setCurrentValue(double value);
	public static void setToZero(MeasuringDevice m) {
		m.setCurrentValue(0);
	}
}
