package corelesson2;

import java.lang.reflect.Field;

public class FieldReflectDemo {
	public static void main(String[] args) {
		User u = new User("zhangsan",30);
		try {
			Class c = u.getClass();
			Field field = c.getDeclaredField("name");
			field.setAccessible(true);//��������Ҳ�иú���
			//ͨ��Field����ֱ�ӻ�ȡ�����Ե�ֵ
			String name = (String)field.get(u);
			System.out.println(name);
			//�޸�������
			field.set(u, name.toUpperCase());
			System.out.println(u.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
