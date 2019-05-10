package lab;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerAppTest {
	public static void main(String[] args) throws Exception {

		String config = "classpath*:META-INF/spring/context-*.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config);

		CustomerService cs = (CustomerService) context.getBean("customerService");

		// 모두삭제
		cs.deleteCustomer(new CustomerVO());

		// INSERT 테스트
		CustomerVO vo1 = new CustomerVO();
		vo1.setId("1");
		vo1.setName("KIM");
		vo1.setAddress("BALENCIA");
		vo1.setTel("010-9999-7777");
		vo1.setGender("FEMALE");
		cs.insertCustomer(vo1);

		CustomerVO vo2 = new CustomerVO();
		vo2.setId("2");
		vo2.setName("LEE");
		vo2.setAddress("WASHINGTON");
		vo2.setTel("010-2222-3333");
		vo2.setGender("MALE");
		cs.insertCustomer(vo2);

		CustomerVO vo3 = new CustomerVO();
		vo3.setId("3");
		vo3.setName("HA");
		vo3.setAddress("SEOUL");
		vo3.setTel("010-1111-4444");
		vo3.setGender("FEMALE");
		cs.insertCustomer(vo3);

		// UPDATE 테스트
		vo1.setName("PARK");
		cs.updateCustomer(vo1);
		
		// SELECT 테스트
		List<CustomerVO> resultList1 = cs.selectCustomer(new CustomerVO());
		System.out.println("Select Result: "+resultList1);
		
		// SELECTLIST 테스트
		List<CustomerVO> resultList = cs.selectCustomerList(new CustomerVO());// 빈것 넣어주면 where 조건에 아무것도 할당 x
		System.out.println("SelectList Result: "+resultList.size());
		
		// DELETE 테스트
		
		//cs.deleteCustomer(vo2);
		
		/* for (int i=0; i<resultList.size(); i++){
			
		}*/
	}
}
