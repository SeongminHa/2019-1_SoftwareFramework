package lab;

import java.util.List;

import org.springframework.stereotype.Repository;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("productDAO")
public class ProductDAO extends EgovAbstractMapper {

	public int insertProduct(ProductVO vo){
		return insert("insertPro",vo);
	}
	public int deleteProduct(ProductVO vo){
		return delete("deletePro",vo);
	}
	public List<ProductVO> selectProList(ProductVO vo){
		return selectList("selectProList",vo);
	}
	public List<ProductVO> selectProductLike(ProductVO vo){
		return selectList("selectProLike",vo);
	}
	public int updateProduct(ProductVO vo){
		return update("updatePro",vo);
	}
	public ProductVO selectProduct(ProductVO vo){
		return selectOne("selectPro",vo);
	}
}

