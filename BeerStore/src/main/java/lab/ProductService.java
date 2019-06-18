package lab;

import java.util.List;

public interface ProductService  {
	
	public int insertProduct(ProductVO productVO) throws Exception;

	public int deleteProduct(ProductVO productVO) throws Exception;
	
	public List<ProductVO> selectProductList(ProductVO productVO)throws Exception;

	public List<ProductVO> selectProductLike(ProductVO productVO)throws Exception;

	public ProductVO selectProduct(ProductVO productVO) throws Exception;
	
	public int updateProduct(ProductVO productVO) throws Exception;
	
}