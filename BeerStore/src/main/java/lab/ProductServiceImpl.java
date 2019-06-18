package lab;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Resource(name="productDAO")
	ProductDAO dao;
	
	public int insertProduct(ProductVO productVO) throws Exception {
		return dao.insertProduct(productVO);
	}

	public int deleteProduct(ProductVO productVO) throws Exception {
		return dao.deleteProduct(productVO);
	}

	public List<ProductVO> selectProductList(ProductVO productVO) throws Exception {
		return dao.selectProList(productVO);
	}

	public ProductVO selectProduct(ProductVO productVO) throws Exception {
		return dao.selectProduct(productVO);
	}

	public int updateProduct(ProductVO productVO) throws Exception {
		return dao.updateProduct(productVO);
	}

	public List<ProductVO> selectProductLike(ProductVO productVO) throws Exception {
		return dao.selectProductLike(productVO);
	}
}
