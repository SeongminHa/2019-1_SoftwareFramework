package lab;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/spring/context-*"})
public class CustServiceTest {
		
	@Resource
	CustomerService cs;
	CustomerVO vo = new CustomerVO();

	//Customer 추가 테스트
	@Test
	public void testInsertCustomer() throws Exception{
		CustomerVO vo = new CustomerVO();
		vo.setId("5");
		vo.setName("KANG");
		vo.setAddress("BEIJING");
		vo.setTel("010-3987-2490");
		vo.setGender("FEMALE");
		cs.insertCustomer(vo);
	}
	//Customer SELECT LIST 테스트
	@Test
	public void testSelectCustomerList() throws Exception{
		CustomerVO vo = new CustomerVO();
		vo.setName("KANG");
		vo.setAddress("BEIJING");
		System.out.println(cs.selectCustomerList(vo));
	}
	//Customer 업데이트 테스트
	@Test
	public void testUpdateCustomer() throws Exception{
		CustomerVO vo = new CustomerVO();
		vo.setName("PARK");
		cs.updateCustomer(vo);
	}
	//Customer 단일 SELECT 테스트
	@Test
	public void testSelectCustomer() throws Exception{
		CustomerVO vo = new CustomerVO();
		System.out.println(cs.selectCustomer(vo));
	}
	//Customer 삭제 테스트
	@Test
	public void testDeleteCustomer() throws Exception{
		CustomerVO vo = new CustomerVO();
		vo.setId("2");
		cs.deleteCustomer(vo);
	}
}
