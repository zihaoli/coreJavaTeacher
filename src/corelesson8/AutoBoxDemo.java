package corelesson8;

import java.util.HashMap;

public class AutoBoxDemo {
	public static void main(String[] args) {
		Integer n1 = 1;//�Զ�װ��   1���װ��Integer���ʵ������
		Integer n2 = new Integer(10);//n2.intValue();
		int a = n2;//�Զ�����,n2ʵ��������Զ�ת����int��10
		
		/*�Զ�װ�����byte  int  long short  -128��127֮��
		 * ����char 0 ��127֮�������Ԫģʽ
		 */
		Integer n9 = 10;
		Integer n10 = 10;
		
		Integer n11 = 128;
		Integer n12 = 128;
		
		Integer n13 = Integer.valueOf("11");
		Integer n14 = Integer.valueOf("11");

		/*
		 * ������Ԫģʽ
		 * 
		 */
		System.out.println(n9==n10);
		System.out.println((n13==n14)+"...");
		/*
		 * û��ʹ����Ԫģʽ
		 */
		System.out.println(n11==n12);
		
		System.out.println("==================");
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		//map��key/value�������Ƕ���
		hm.put("a", 1);//�Զ�װ��
		int x = hm.get("a");//�Զ�����
	}
}
