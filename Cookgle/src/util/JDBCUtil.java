package util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
	
	// Connection �깮�꽦
	public static Connection getConnection(){
		Connection con = null;
		
		try {
			Properties p = new Properties();
			p.load(new FileInputStream("C:\\lib\\dbinfo.txt"));
			
			String driver = p.getProperty("driver");
			String url = p.getProperty("url");
			String user = p.getProperty("user"); 
			String pw = p.getProperty("pw");   
			
			Class.forName(driver);
			con =  DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC DRiver �솗�씤 �븘�슂");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return con;
	}
	
	// �옄�썝 諛섎궔
	public static void close(Connection con,Statement st,ResultSet rs){
		try {
			if(rs != null) rs.close();
			if(st != null) st.close();
			if(con != null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}





