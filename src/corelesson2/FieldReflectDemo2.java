package corelesson2;

import java.lang.reflect.Field;

public class FieldReflectDemo2 {
	public static void main(String[] args) {
		User u = new User("zhangsan", 30);
		//changeValue(u);
		//System.out.println(u.getName() + "," + u.getAge());
		System.out.println(getSql(u));
	}

	/**
	 * �õ�insert into ����������1������2..)values(?,?...)
	 * 
	 * @param obj
	 * @return
	 */
	public static String getSql(Object obj) {
		/*
		 * ��ȡ�����Ϣ ������������ Ȼ����ƴ��
		 */
		StringBuilder s = new StringBuilder();
		s.append("insert into ");
		Class c = obj.getClass();
		String className = c.getSimpleName();
		s.append(className).append("(");
		Field[] fs = c.getDeclaredFields();
		for (int i = 0; i < fs.length; i++) {
			s = i == 0 ? s.append(fs[i].getName()) : s.append(",").append(
					fs[i].getName());
		}
		s.append(")values").append(getString(fs.length));
		
		return s.toString();
	}

	private static String getString(int length) {
		StringBuilder s = new StringBuilder();
		s.append("(");
		for (int i = 0; i < length; i++) {
			s = i == 0 ? s.append("?") : s.append(",?");
		}
		return s.append(")").toString();
	}

	/**
	 * �޸Ķ��������ֵ �ַ�������ֵȫ����ɴ�д int���͵�����ֵ��ȫ������100
	 * 
	 * @param object
	 */
	public static void changeValue(Object object) {
		/*
		 * object��������Щ���Բ������ ����������Ҫ�������������� �ҳ�����String���͵� int���͵�����
		 * �ҵ�����֮��ͨ����Ա�����ķ������
		 */
		// 1.��ȡ������
		Class c = object.getClass();
		// 2.��ȡ���е�����
		Field[] fs = c.getDeclaredFields();
		// 3.�������е�����
		for (Field field : fs) {
			// 4.�õ����Ե�����
			Class fieldType = field.getType();
			// 5.�ж�
			/*
			 * if(fieldType.getSimpleName().equals("String")){ }
			 * if(fieldType.getSimpleName().equals("int")){ }
			 */
			try {
				if (fieldType == String.class) {
					// 6.��Ա��������Ĳ���
					field.setAccessible(true);
					String oldValue = (String) field.get(object);
					field.set(object, oldValue.toUpperCase());
				}
				if (fieldType == int.class) {
					field.setAccessible(true);
					int oldValue = (Integer) field.get(object);
					field.set(object, oldValue + 100);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
