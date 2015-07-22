package corelesson2;

import java.lang.reflect.Method;

public class ArrayReflectDemo1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 }; // a��һ������ ��ô�������������ͣ���α�ʾ��
		Class c = a.getClass();
		System.out.println(c.getName());

		int[] b = { 2, 3, 4, 5, 6 };
		Class c1 = b.getClass();
		System.out.println(c1.getName());

		System.out.println(int[].class == c1);// �����������ֻ����������ͺ�ά���й�
		String[][] ss = { {}, {} };
		System.out.println(String[][].class == ss.getClass());
		// ��ȡtest����
		Class c2 = B.class;
		try {
			Method method = c2.getMethod("test", new Class[] { String[].class,
					int[].class });
			method.invoke(c2.newInstance(), new Object[] {
					new String[] { "hello", "world" }, new int[] { 10, 20 } });
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class B {
	public void test(String[] a, int[] b) {
		for (int i : b) {
			System.out.println(i);

		}
		for (String str : a) {
			System.out.println(str);
		}
	}
}
