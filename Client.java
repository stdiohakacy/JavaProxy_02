package structual.Proxy._02;

public class Client {
	public static void main(String[] args) {
		UserService admin = new UserServiceProxy("admin", "duy");
		admin.load();
		admin.insert();
		
		UserService user = new UserServiceProxy("user", "tieu");
		user.load();
		user.insert();
	}
}
