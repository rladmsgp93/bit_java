package util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
//connection 생성

	public static Connection getConnection() {

		Connection con = null;
		try {
			Properties p = new Properties();
			p.load(new FileInputStream("c://lib//dbinfo.txt"));
			String driver = p.getProperty("driver");
			String url = p.getProperty("url");
			String user = p.getProperty("user");// madang hr
			String pw = p.getProperty("pw");// madang hr
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pw);

		} catch (ClassNotFoundException e) {
			System.out.println("jdbc드라이버 필여");
		} catch (Exception e) {
			e.getMessage();
		}
		return con;

	}

//자원 반납
	public static void close(Connection con, Statement st, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
