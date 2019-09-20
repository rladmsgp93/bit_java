package service;

import java.util.List;

import dao.ProductDAO;
import vo.ProductVO;

public class ProductServiceImpl implements ProductService {
    
	ProductDAO dao;
	
	public ProductServiceImpl() {}
	public ProductServiceImpl(ProductDAO dao) {
		this.dao = dao;
	}
	
	public ProductDAO getDao() {
		return dao;
	}
	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<ProductVO> ProductList() {
		return dao.getProductRec();
	}

	@Override
	public int addProduct(ProductVO vo) throws Exception {
		return dao.insertProduct(vo);
	}

	@Override
	public int deleteProduct(int P_id) {
		return dao.deleteProduct(P_id);
	}

}
