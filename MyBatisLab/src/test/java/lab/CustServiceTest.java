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
	CustomerService custSevice;
		
	//Customer 추가 테스트
	@Test
	public void testInsertCustomer() throws Exception{
		
	}
	
	//Customer 리스트 출력 테스트
	@Test
	public void testSelectCustomerList() throws Exception{
		
	}
	
	//Customer 삭제 테스트
	@Test
	public void testDeleteCustomer() throws Exception{
	
	}
	

}
