package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestApp {
	public static void main(String[] args) {
		/*
		WelcomeBean wb=new WelcomeBeanImpl(); //필요할 때마다 생성
		wb.setMessage("Hello Lab101!!");
		wb.show();
		
		WelcomeBean wb2=new WelcomeBeanImpl(); //필요할 때마다 생성
		wb2.setMessage("Hello Another Lab101!!");
		wb2.show();
		*/
		Resource res=new ClassPathResource("context.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		/*
		WelcomeBean wb=(WelcomeBean)factory.getBean(WelcomeBeanImpl.class.getName());
		context.xml의 bean태그 name 지정되지 않았을 때 spring.WelcomeBeanImpl 불러옴
		wb.show();
		System.out.println(wb.hashCode());
		*/
		
		WelcomeBean wb2=(WelcomeBean)factory.getBean("welcomebean");
		wb2.show();
		System.out.println(wb2.hashCode());
		
		WelcomeBean wb3=(WelcomeBean)factory.getBean("welcomebean");
		wb3.show();
		System.out.println(wb3.hashCode());

		/*
		 한번만 생성
		 import한 lib는 DI관련
		 */
	}

}
