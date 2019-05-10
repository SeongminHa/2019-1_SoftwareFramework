package lab;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Resource(name="customerDAO")
	CustomerDAO dao;
	
	@Override
	public int insertCustomer(CustomerVO customerVO) throws Exception {
		return dao.insertCustomer(customerVO);
	}
	
	@Override
	public int deleteCustomer(CustomerVO customerVO) throws Exception {
		return dao.deleteCustomer(customerVO);
	}

	@Override
	public List<CustomerVO> selectCustomerList(CustomerVO customerVO) throws Exception {
		return dao.selectCustList(customerVO);
	}

	@Override
	public  List<CustomerVO> selectCustomer(CustomerVO customerVO) throws Exception {
		return dao.selectCustomer(customerVO);
	}

	@Override
	public int updateCustomer(CustomerVO customerVO) throws Exception {
		return dao.updateCustomer(customerVO);
	}
	
}
