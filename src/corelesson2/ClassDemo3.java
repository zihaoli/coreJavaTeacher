package corelesson2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.swing.JButton;

public class ClassDemo3 {
	public static void main(String[] args) {
		//System.out.println(ClassDemo3.class.getClassLoader().getClass().getName());
		printClassMessage("hello");
	}
	public static void printClassMessage(Object obj){
		/*Ҫ��ȡ�����Ϣ���Ȼ�ȡ��������
		 * 3�ַ�ʽ������������ѡ��
		 */
		Class c = obj.getClass();
		//��ȡ����
		System.out.println(c.getName());
		//��ȡ����������������
		System.out.println(c.getSimpleName());
		/*��ȡ��ķ���--->����Ҳ�Ƕ���
		 * java.lang.reflect.Method��Ķ���
		 * 
		 * getMethods��ȡ�����е�public�ķ�����
		 * ����̳е�Ҳ��
		 * getDeclaredMethods() ���Լ������ķ��������ʷ���Ȩ��
		 * �̳еĵò���
		 */
		Method[] ms = c.getMethods();
		for(int i = 0 ; i < ms.length;i++){
			//��ȡ���Ƿ����ķ���ֵ���͵�������
			Class returnType = ms[i].getReturnType();
			System.out.print(returnType.getName()+"  ");
			System.out.print(ms[i].getName()+"(");
			//��ȡ���Ƿ����Ĳ����б��������
			Class[] paramsType = ms[i].getParameterTypes();
			for(int j = 0; j < paramsType.length;j++){
				System.out.print(paramsType[j]+",");
			}
			System.out.println(")");
		}
		System.out.println("===============================");
		/*
		 *  ��Ա����Ҳ�Ƕ���java.lang.reflect.Field
		 * getDeclaredFields��ȡ�����Լ������ĳ�Ա����
		 * getFields������ȡ����public�ĳ�Ա����
		 */
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			//��ȡ���ǳ�Ա������������
			Class fieldType = field.getType();
			System.out.println(fieldType.getName()+" "+field.getName());
		}
		
		System.out.println("===========================");
		/*
		 * ���еĹ��캯������java.lang.reflect.Constructor��Ķ���
		 * getDeclaredConstructors
		 * getConstructors
		 */
		Constructor[] cs = c.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			System.out.print(constructor.getName()+"(");
			//��ȡ�˹��캯���Ĳ����б��������
			Class[] paramsType = constructor.getParameterTypes();
			for (Class class1 : paramsType) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
		
		System.out.println("======================");
		Package package1 = c.getPackage();
		System.out.println(package1.getName());
		System.out.println("=====================");
		System.out.println(c.isInterface());
	}
}

