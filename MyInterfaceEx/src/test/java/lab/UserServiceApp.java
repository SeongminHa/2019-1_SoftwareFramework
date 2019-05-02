package lab;

public class UserServiceApp {
	public static void main(String[] args) {
		/*
		 * UserServiceImpl usi = new UserServiceImpl();
		 * usi.getId();
		 * usi.getName();
		 * IDService ids = new UserServiceImpl();
		 * ids.getId();
		 * NameService ns = new UserServiceImpl();
		 * ns.getName();
		 */
		UserService us = new UserServiceImpl();// 다형성
		us.getId();
		us.getName();

		UserService us2 = new AnotherUserServiceImpl();
		us2.getId();
		us2.getName();
	}
}
