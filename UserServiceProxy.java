package structual.Proxy._02;

public class UserServiceProxy implements UserService {
	private String role;
	private UserService userService;

	public UserServiceProxy(String role, String name) {
		this.role = role;
		userService = new UserServiceImpl(name);
	}

	@Override
	public void load() {
		userService.load();
	}

	@Override
	public void insert() {
		if (isAdmin()) {
			userService.insert();
		} else {
			throw new IllegalAccessError("Access denied!");
		}
	}

	private boolean isAdmin() {
		return "admin".equalsIgnoreCase(this.role);
	}
}
