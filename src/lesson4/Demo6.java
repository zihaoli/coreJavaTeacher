package lesson4;

public class Demo6 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(30);
		System.out.println(p.getAge());
		System.out.println("=====================");
		p.setAge(1000);
	}
}
class Person{
	private int age;
	public void setAge(int age) {
	    try {
	    	if(age < 0 || age >120)
				throw new Exception();
			this.age = age;
		} catch (Exception e) {
			System.out.println("���䳬���˷�Χ!����д����");
		}
	}
	public int getAge() {
		return age;
	}
}
