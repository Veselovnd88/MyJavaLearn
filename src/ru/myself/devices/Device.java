package ru.myself.devices;

import java.util.Calendar;


public abstract class Device {
	

	public Device(String type, String article,double weight) {
		setType(type);
		setArticle(article);
		setWeight(weight);
	}
	
	private double weight;
	private String type;
	private String article;
	private Calendar produced;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {	
		this.weight = Math.max(0.1, weight);
	}
	
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if(type.equals("")|| type==null) {
			this.type = "Unknown device";
		}
		this.type = type;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		if(article.equals("")|| article==null) {
			this.article = "Noname";
		}
		this.article = article;
	}
	public Calendar getProduced() {
		return produced;
	}
	public void setProduced(Calendar produced) {
		this.produced = produced;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Device)) {
			return false;
		}
		else {
			Device other = (Device) o;
			return this.article.equals(other.article);}
		}

	@Override
	public int hashCode() {

		return article.hashCode();
	}
	@Override
	public String toString() {
		if(produced==null) {
			return String.format("This is %s with %s article", getType(),getArticle());
		}
		else {
			return String.format("This is %s with %s article, produced ", getType(),getArticle(), getProduced().get(Calendar.YEAR));
		}
		
	}

}
