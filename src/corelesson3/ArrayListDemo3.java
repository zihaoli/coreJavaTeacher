package corelesson3;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		System.out.println(list);
		//list.add(100);
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("======================");
		//���䶼���ƹ��������
		/*��֤1��*/
		ArrayList list2 = new ArrayList();
		//�����true˵����������һ���ģ���ôҲ���Ǳ������ȥ���ͻ���
		System.out.println(list.getClass()==list2.getClass());
		System.out.println(list.getClass()==ArrayList.class);
		/*��֤2:��add�����ķ��������в���*/
		try {
		    Method method = list.getClass().getMethod("add", new Class[]{Object.class});
		    method.invoke(list, new Object[]{100});
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list.size());
		System.out.println(list);
		//��������forEach�����ͻ����쳣
		/*for(String str:list){
			System.out.println(str);
		}*///ƽʱû�б�Ҫ��������
	}


}
