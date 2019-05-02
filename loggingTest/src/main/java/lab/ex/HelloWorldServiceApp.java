package lab.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldServiceApp {

	
	public static void main(String[] args) {
		
		ApplicationContext context 
			= new ClassPathXmlApplicationContext("context-*.xml");
		
	   HelloWorldService helloworld 
	   		= (HelloWorldService) context.getBean("helloworld");
	   
	   HelloWorldService helloworld2 
  		= (HelloWorldService) context.getBean("anotherhello");

	  // helloworld.sayError();
	  // helloworld2.sayError();
	   
	   System.out.println(helloworld.sayHello());
	   
	   //System.out.println(helloworld2.sayHello());

	   
	   /*try{
		   helloworld.sayError();
	   } catch (Exception e) {
		   System.out.print(e.getMessage());
		// TODO: handle exception
	   }*/
	}
}
