package spring;

public class WelcomeBeanImpl implements WelcomeBean{
	private String message;
	@Override
	public void setMessage(String message) {
		this.message=message;
	}
	@Override
	public void show() {
		System.out.println(this.message);
	}
	
}
