package lab;

import org.springframework.stereotype.Service;

@Service("customerannotation")
public class CustomerAnnotationServiceImpl implements CustomerService  {

	public String getCustName() {
		return "Smith";
	}

	public String getCustGrade() {
		return "A";
	}

}
