package corelesson2;

import java.lang.reflect.Array;

public class ArrayReflectDemo4 {
	public static void main(String[] args) {
		test(new int[]{1,2,3});
		test("hello");
		System.out.println("===================");
		printObject(new int[]{1,2,3});
		System.out.println("=============");
		printObject(new String[][]{{"hello","world"},{"aaa","bbbb"}});
	}
	public static void test(Object obj){
		Class c = obj.getClass();
		//�ж϶����ǲ�������
		System.out.println(c.isArray());
	}
	/**
	 * ���object�Ƿ��������ֱ�Ӵ�ӡtoString
	 * ���object�����飬��ӡ�����е�ÿ��Ԫ��
	 * @param object
	 */
	public static void printObject(Object object){
		//�ж��Ƿ�Ϊ����
		Class c = object.getClass();
		if(c.isArray()){
			//��ȡ���鳤��
			int length = Array.getLength(object);
			//���������Ԫ��
			for(int i = 0; i < length;i++){
				//��ȡ�����е�ÿ��Ԫ��
				Object obj = Array.get(object, i);
				//�����ÿ��Ԫ�ؿ�������һ������ �ݹ�
				printObject(obj);
				
			}
		}else{
			System.out.println(object);
		}
	}

}
