package lab;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerServiceApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/context-common.xml");// xml파일 해석하는 클래스
		/*
		CustomerService cs=(CustomerService)context.getBean(CustomerXMLServiceImpl.class.getName());
		System.out.println(cs.getCustGrade());
		System.out.println(cs.getCustName());
		*/
		CustomerService cs=(CustomerService)context.getBean(CustomerAnnotationServiceImpl.class);
		System.out.println(cs.getCustName());
		System.out.println(cs.getCustGrade());
	}
}
