package service;

import java.util.List;
import vo.ProductVO;

public interface ProductService {
	
	List<ProductVO> ProductList();
	int addProduct(ProductVO vo) throws Exception;
	int deleteProduct(int pid);

}
