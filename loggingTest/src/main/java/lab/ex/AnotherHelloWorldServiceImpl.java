package lab.ex;

import org.springframework.stereotype.Service;

@Service("anotherhello")
public class AnotherHelloWorldServiceImpl implements HelloWorldService{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Another HelloWorld!!!";
	}

	@Override
	public void sayError() {
		// TODO Auto-generated method stub
		double i =100/0;
		
	}

	
}
