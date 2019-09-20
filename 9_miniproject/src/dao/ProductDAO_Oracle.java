package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.ProductVO;

public class ProductDAO_Oracle extends ProductDAO {
	
 	public List<ProductVO> getBookRec(){
 		String sql =
 				"select * from products";
 					   
 					    		
 					    		
 		List<ProductVO> list = new ArrayList<ProductVO>();
 		
 		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			//실행 및 결과값 핸들링
            rs = ps.executeQuery();
            while (rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setP_id(rs.getInt("P_id"));
				vo.setPname(rs.getString("pname"));
				vo.setCategory((rs.getString("category")));
				vo.setPrice(rs.getInt("price"));
				vo.setImg((rs.getString("img")));
				vo.setUserid((rs.getString("userid")));
				list.add(vo);
			}

            
		}catch (Exception e) {
          e.printStackTrace();
		
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
 		return list;
	}
	
	public int insertProduct(ProductVO vo) throws Exception{
		String sql= "INSERT INTO products(p_id, pname, category, price, img, userid) VALUES(p_id.nextval,?,?,?,?,?)";
		
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			
			ps.setString(1, vo.getPname());
			ps.setString(2, vo.getCategory());
			ps.setInt(3, vo.getPrice());
			ps.setString(4, vo.getImg());
			ps.setString(5, vo.getUserid());
			
			//실행 및 결과값 핸들링
            result = ps.executeUpdate();
		}catch (Exception e) {
			throw e;//나를 호출 한 곳에서 처리
			// e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}
 	
	
	public int deleteBook(int P_id) {
		String sql = "delete from products where pid = ?";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setInt(1, P_id);
			//실행 및 결과값 핸들링
            result = ps.executeUpdate();
            
            
		}catch (Exception e) {
           e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, null);
		}

		return result;
	}
	
	

	
	
}
