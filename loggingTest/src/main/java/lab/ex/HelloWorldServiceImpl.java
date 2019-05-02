package lab.ex;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorldServiceImpl implements HelloWorldService {

	Logger logger1 = LogManager.getLogger(HelloWorldServiceImpl.class.getName());
	
	private String name;
	private String lastName;
	
	/*@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}*/
	
	public HelloWorldServiceImpl(String name, String lname ) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.lastName = lname;
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		logger1.error("sayHello running!!!");
		/*logger1.warn("warn");
		logger1.info("info");
		logger1.debug("debug");		
		logger1.trace("trace");	*/
		
		
		
		return "sayHello 리턴 값: Hello " + this.lastName + " " + this.name +"!!!";
	}

	public void sayError(){
		double i = 100/0;
		/*try{
			double i = 100/0;
		} catch (Exception e) {
			// TODO: handle exception
			logger1.error(e.getMessage());
		}*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
