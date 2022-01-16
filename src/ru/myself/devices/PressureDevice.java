package ru.myself.devices;

public abstract class PressureDevice extends Device {
	
	public PressureDevice(String type, String article,double weight, double range, String conn){
		super(type,article,weight);
		setRange(range);
		setConnection(conn);
		
	}

	private double range;
	private String connection;
	public double measure() {
		if (super.getInstall()) {
			return (super.getWeight()*70/range);
		}
		else return 0;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		if(range>700) {
			this.range =700;
		}
		if (range<-1){
			this.range = -1;			
		}
		else {this.range = range;}
	}
	
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	
}
