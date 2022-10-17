package com.bike.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Bike {
	
	@Id
	private int bikeModelNo;
	private String bikeName;
	private String bikeColor;
	
	
	
	public int getBikeModelNo() {
		return bikeModelNo;
	}
	public void setBikeModelNo(int bikeModelNo) {
		this.bikeModelNo = bikeModelNo;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getBikeColor() {
		return bikeColor;
	}
	public void setBikeColor(String bikeColor) {
		this.bikeColor = bikeColor;
	}
	
	
	
	
	
	

}
