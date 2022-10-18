package ServletClass;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bike.dao.BikeDAO;
import com.bike.dto.Bike;

@WebServlet("/getBikes")
public class GetBikes extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		
		BikeDAO bDao = new BikeDAO();
		
	List<Bike> bikes = 	bDao.getAllBikes();
	
	if(bikes.size()>=1) {
		RequestDispatcher RD = req.getRequestDispatcher("getBikes.jsp");
		
		req.setAttribute("list", bikes);
		
		RD.forward(req, resp);
	} else {
		PrintWriter pw = resp.getWriter();
		
		pw.println("No Bikes In This List");;
	}
	
	
		
		
		
	
	
	}
	
	

}
