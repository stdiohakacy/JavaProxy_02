package structual.Proxy._02;

public class UserServiceImpl implements UserService {
	private String name;

	public UserServiceImpl(String name) {
		super();
		this.name = name;
	}

	@Override
	public void load() {
		System.out.println(name + " loaded");

	}

	@Override
	public void insert() {
		System.out.println(name + " inserted");
	}

}
