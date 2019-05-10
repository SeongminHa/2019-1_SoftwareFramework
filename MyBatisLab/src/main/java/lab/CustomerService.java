package lab;

import java.util.List;

public interface CustomerService  {
	
	public int insertCustomer(CustomerVO customerVO) throws Exception;

	public int deleteCustomer(CustomerVO customerVO)throws Exception;

	public List<CustomerVO> selectCustomerList(CustomerVO customerVO)throws Exception;
}
