import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class MyJDBCTestApp {
	public static void main(String[] args) {
		try { 
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded"); 
		} catch (ClassNotFoundException e) { 
			System.out.println("Can not find driver class"); 
		}
		Connection conn = null;
		try { 
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lab412", "com", "com01" );
			System.out.println("connected");
		}
	}
}
