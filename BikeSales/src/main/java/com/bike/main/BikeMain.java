package com.bike.main;

import com.bike.dto.BikeDAO;

public class BikeMain {

	public static void main(String[] args) {

		BikeDAO bike1 = new BikeDAO(123,"Yamaha", "Blue");
		
	    bike1.AddBike();
	    
		
	}

}
