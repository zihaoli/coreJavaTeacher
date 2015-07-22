package corelesson2;

import java.lang.reflect.Method;

public class MethodReflectDemo3 {

	public static void main(String[] args) {
		User u = new User("zhangsan",30);
		System.out.println(getValueByPropertyName("age", u));

	}
	/**
	 * ���ݱ�׼javaBean����������ȡ������ֵ
	 * @param propertyName ���Ե�����
	 * @param object  ����
	 * @return
	 */
	public static Object getValueByPropertyName(
			String propertyName,Object object){
		/*
		 * ��׼��javaBean����getter/setter����
		 * ������������ȡget����
		 * Ȼ��ͨ��get�����ķ����������
		 */
		//1.��ȡ������
		Class c = object.getClass();
		//2.��ȡ��������
		String methodName = "get"+propertyName.substring(0,1)
				.toUpperCase()+propertyName.substring(1);
		//3.��ȡ��������---->get�����޲���
		try {
			Method m = c.getMethod(methodName, new Class[]{});
			//4.�����ķ������
			Object value = m.invoke(object, new Object[]{});
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

