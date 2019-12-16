package json_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import util.JDBCUtil;

public class JsonDB {
	
	
	public static String idCheck(String id) {
		String sql = "select * from users where id =? ";
	
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//JSONArray array = new JSONArray();
		
		Map<String, String> map = new HashMap<String, String>();
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			rs = ps.executeQuery();
			//결과값 핸들링
			
			while(rs.next()) {
				map.put("id", rs.getString("id"));
			}
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		return JSONObject.toJSONString(map);
	}
	
	}



