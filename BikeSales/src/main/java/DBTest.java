import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {
	
	static String url = "jdbc:mysql://localhost:3306/bike";
	static String user = "root";
	static String password = "";

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection working!!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
