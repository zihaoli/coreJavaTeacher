package corelesson4;

import java.io.IOException;
import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;
	private transient  int age;
	public Student(){}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	private void readObject(java.io.ObjectInputStream stream)
		     throws IOException, ClassNotFoundException{
		//��jvmĬ�����л���Ԫ�ؽ��з����л�
		stream.defaultReadObject();
		//��age���з����л�
		this.age = stream.readInt();
	}

	private void writeObject(java.io.ObjectOutputStream stream)
		     throws IOException{
		//��jvm�ܹ�Ĭ�����л���Ԫ�ؽ��� �������л�����
		stream.defaultWriteObject();
		//age�Լ����л�
		stream.writeInt(age);
	}

}
