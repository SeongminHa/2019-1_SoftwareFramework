package lab;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.runner.RunWith;

import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/spring/context-*"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustServiceTest {
		
    @Resource(name = "dataSource")
    DataSource dataSource;
    @Resource
    CustomerService cs;

	/* Customer INSERT 테스트 */
	@Test
	public void test1InsertCustomer() throws Exception{
				
		CustomerVO vo1 = new CustomerVO();
		CustomerVO vo2 = new CustomerVO();
		CustomerVO vo3 = new CustomerVO();
		CustomerVO vo4 = new CustomerVO();

		vo1.setId("1");
		vo1.setName("HA");
		vo1.setAddress("SAN FRANCISCO");
		vo1.setTel("010-1111-2222");
		vo1.setGender("FEMALE");
		cs.insertCustomer(vo1);

		vo2.setId("2");
		vo2.setName("WI");
		vo2.setAddress("BEIJING");
		vo2.setTel("010-3333-4444");
		vo2.setGender("MALE");
		cs.insertCustomer(vo2);
		
		vo3.setId("3");
		vo3.setName("HA");
		vo3.setAddress("SEOUL");
		vo3.setTel("010-5555-6666");
		vo3.setGender("FEMALE");
		cs.insertCustomer(vo3);
		
		vo4.setId("4");
		vo4.setName("KIM");
		vo4.setAddress("BALENCIA");
		vo4.setTel("010-7777-8888");
		vo4.setGender("FEMALE");
		cs.insertCustomer(vo4);
	}
	
	/* Customer UPDATE 테스트 */
	@Test
	public void test2UpdateCustomer() throws Exception{
		
		CustomerVO vo = new CustomerVO();
		
		vo.setId("2");
		vo.setName("LEE");
		cs.updateCustomer(vo);
	}
	
	/* Customer DELETE 테스트 */
	@Test
	public void test3DeleteCustomer() throws Exception{
		
		CustomerVO vo = new CustomerVO();
		
		vo.setId("4");
		cs.deleteCustomer(vo);
	}
	
	/* Customer SELECT 테스트 */
	@Test
	public void test4SelectCustomer() throws Exception{
		
		CustomerVO vo = new CustomerVO();
		
		vo.setId("3");
		CustomerVO result=cs.selectCustomer(vo);
		System.out.println(result);
		
		assertEquals("HA", result.getName());
		assertEquals("SEOUL", result.getAddress());
		assertEquals("010-5555-6666", result.getTel());
		assertEquals("FEMALE", result.getGender());
	}
	
	/* Customer SELECTLIST 테스트 */
	@Test
	public void test5SelectCustomerList() throws Exception{
		
		CustomerVO vo = new CustomerVO();
		
		vo.setName("HA");
		List <CustomerVO> resultList=cs.selectCustomerList(vo);
		System.out.println(resultList.size());
		
		assertEquals(2, resultList.size());
	}
}
