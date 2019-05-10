package lab;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("customerDAO")
public class CustomerDAO extends EgovAbstractMapper {
	public int insertCustomer(CustomerVO vo){
		return insert("insertCust",vo);
	}
	public int deleteCustomer(CustomerVO vo){
		return delete("deleteCust",vo);
	}
	public List<CustomerVO> selectCustList(CustomerVO vo){
		return selectList("selectCustList",vo);
	}
	public int updateCustomer(CustomerVO vo){
		return update("updateCust",vo);
	}
	public List<CustomerVO> selectCustomer(CustomerVO vo){
		return selectList("selectCust",vo);
	}
}