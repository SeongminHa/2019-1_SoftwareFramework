
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lab.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/context-*.xml" })
public class CustomerServiceJUnitApp {
	@Resource(name = "customerannotation")
	CustomerService cs;
	@Resource(name = "custxml")
	CustomerService cs2;

	@Test
	public void TestAnnotation() {
		System.out.println(cs.getCustName());
		System.out.println(cs.getCustGrade());
	}

	@Test
	public void TestXML() {
		System.out.println(cs2.getCustName());
		System.out.println(cs2.getCustGrade());
	}
}
