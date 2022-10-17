package com.bike.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bike.dao.Bike;

public class BikeDAO {
	
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




	public BikeDAO(int bikeModelNo, String bikeName, String bikeColor){
		
		this.bikeModelNo = bikeModelNo;
		this.bikeName = bikeName;
		this.bikeColor = bikeColor;
		
	}
	
	

	
	public void AddBike() {
		SessionFactory factory = new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(Bike.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Bike bike = new Bike();
		bike.setBikeModelNo(bikeModelNo);
		bike.setBikeName(bikeName);
		bike.setBikeColor(bikeColor);
		session.save(bike);
        session.getTransaction().commit();
		
	}
	
	
	
	

}
