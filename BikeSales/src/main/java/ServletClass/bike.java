package ServletClass;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bike.dao.BikeDAO;
import com.bike.dto.Bike;

@WebServlet("/save")
public class bike extends HttpServlet {

	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
			Bike bike = new Bike();
			bike.setBikeModelNo(Integer.parseInt(request.getParameter("bikeModelNo")));
			bike.setBikeName(request.getParameter("bikeName"));
			bike.setBikeColor(request.getParameter("bikeColor"));
			BikeDAO bikeDAO = new BikeDAO();
		int a =	bikeDAO.AddBike(bike);
		
	    PrintWriter pw = response.getWriter();	
			if(a>0) {					
			RequestDispatcher rD = request.getRequestDispatcher("getBikes");
			rD.include(request, response);
			}
			else {
				pw.println("Not Added");
			}	
		} 
	}


