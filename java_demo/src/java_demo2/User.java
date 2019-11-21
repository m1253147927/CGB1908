package java_demo2;

public class User {
	public Integer id;
	private String name;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(Integer id) {
		super();
		this.id = id;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
