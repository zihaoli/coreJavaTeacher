package corelesson3;

public class User implements Comparable<User>{
	private String name;
	private String pass;
	private int age;
	public User(){}
	public User(String name, String pass, int age) {
		super();
		this.name = name;
		this.pass = pass;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	@Override
	public int compareTo(User o) {
		if(!this.name.equals(o.name))
			return o.name.compareTo(this.name);
		return 0;
	}
	
}
