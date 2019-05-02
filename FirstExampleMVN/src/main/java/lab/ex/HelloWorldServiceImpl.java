package lab.ex;

import org.springframework.beans.factory.annotation.Required;

public class HelloWorldServiceImpl implements HelloWorldService{

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello " + name + "!!!" ;
	}
}
