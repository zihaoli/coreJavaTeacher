package corelesson2;

import java.lang.reflect.Method;

public class MethodReflectDemo {
	public static void main(String[] args) {
		/*
		 * ��ȡ��������---->ĳһ������ ��ȡһ������Ӧ���ɷ������ƺͲ����б������� getMethod(�������ƣ�������������)
		 */
		MethodTest mt = new MethodTest();
		Class c = mt.getClass();
		try {
			Method method = c.getMethod("f",
					new Class[] { int.class, int.class });
			mt.f(10, 10);// mt������f����
			System.out.println("=======================");
			/*
			 * �ܲ��ܹ�ֱ��ͨ��method����ֱ�ӵ��÷���Ч����mt.f(10,10)�ȼ� ����Ƿ�������Ҫ��������
			 * method.invoke(�����Ķ��󣬲���)
			 */
			method.invoke(mt, new Object[] { 10, 10 });// ��mt.f(10,10)�ȼ�

			System.out.println("=====================");
			Method method2 = c.getMethod("f", new Class[] { int.class,
					int.class, int.class });
			System.out.println(mt.f(10, 10, 10));
			// ͨ��method2ֱ�Ӳ���
			int result = (Integer) method2.invoke(mt,
					new Object[] { 10, 10, 10 });
			System.out.println(result);

			System.out.println("=============================");
			String s1 = "hello";
			String s2 = "world";
			System.out.println(s1.concat(s2));
			/*
			 * ��concat�����ķ��������� ���Ȼ�ȡString������
			 */
			Class c1 = s1.getClass();// String.class s2.getClass()
			// ��ȡconcat
			Method concatMethod = c1.getMethod("concat",
					new Class[] { String.class });
			String ss = (String)concatMethod.invoke(s1, new Object[]{s2});
			System.out.println(ss);
			System.out.println("==========================");
			Method fmethod = c.getMethod("f", new Class[]{});
			fmethod.invoke(mt, new Object[]{});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MethodTest {
	public void f(){
		System.out.println("helloworld");
	}
	public void f(int a, int b) {
		System.out.println(a + b);
	}

	public int f(int a, int b, int c) {
		System.out.println("�����������");
		return a + b + c;
	}
}
