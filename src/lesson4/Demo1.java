package lesson4;

import java.io.FileInputStream;

public class Demo1 {
	public static void main(String[] args) {
		/*
		 * ��һ�д�����Ҳ���ܲ����쳣��
		 *  eclipse��Ȼû����,˵����ͨ������
		 *  ˵���µ��쳣��ʵjvm�����Զ�����
		 *  ��ȻҲ�����Լ�����--->���Ը��Ѻõ���ʾ
		 */
		try {
			/*���ܻ�����쳣�Ĵ���
			 * һ�������쳣���ͻ����һ���쳣����
			 */
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�����±�Խ�磡");
		}
		
		/*һ�´�������Լ����������벻ͨ��*/
		//FileInputStream in = new FileInputStream("aa.txt");
		
		
	}
}
