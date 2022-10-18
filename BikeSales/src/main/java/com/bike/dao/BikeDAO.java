package com.bike.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bike.dto.Bike;

public class BikeDAO {
	
	public BikeDAO(){
		
		
	}
	
	
	public int AddBike(Bike bike) {
	
		String url = "jdbc:mysql://localhost:3306/bike";
		String user = "root";
		String password = "";
		
		Connection conn=null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		    conn = DriverManager.getConnection(url, user, password);
			String query = "Insert into bike values(?,?,?)";
			PreparedStatement PS =  conn.prepareStatement(query);
			PS.setInt(1, bike.getBikeModelNo());
			PS.setString(2, bike.getBikeName());
			PS.setString(3, bike.getBikeColor());
            int a = PS.executeUpdate();
			conn.close();
			return a;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public boolean deleteBike(int id) {
		
		String url = "jdbc:mysql://localhost:3306/bike";
		String user = "root";
		String password = "";
		
		Connection conn=null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		    conn = DriverManager.getConnection(url, user, password);
			String query = "Delete from bike where bikeModelNo=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			boolean bool = ps.execute();
			
			return bool;
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return false;
		
	}
	
	public List<Bike> getAllBikes(){
		
		String query = "Select * from bike";
		
		String url = "jdbc:mysql://localhost:3306/bike";
		String user = "root";
		String password = "";
		
		Connection conn=null;
		
try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    conn = DriverManager.getConnection(url, user, password);
		    PreparedStatement ps = conn.prepareStatement(query);
		    ResultSet result = ps.executeQuery();
		    List<Bike> list = new ArrayList();
		    
		    while(result.next()) {    	
		    	Bike bik = new Bike();    	
		    	bik.setBikeModelNo(result.getInt(1));
		    	bik.setBikeName(result.getString(2));
		    	bik.setBikeColor(result.getString(3));
                list.add(bik);
		    	
		    } 
		    return list;
}catch(Exception e) {
	e.printStackTrace();
}
return null;		
	}
	
	

}
