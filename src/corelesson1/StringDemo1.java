package corelesson1;

public class StringDemo1 {
	public static void main(String[] args) {
		//�ⲿ������Ҫ����ѧ��ͨ���鿴�����еĹ��췽��
		char[] chars = {'a','b','c','d','e'};
		String s = new String(chars);
		System.out.println(s);
		String s1 = new String(chars,1,2);
		System.out.println(s1);
		
		String s2 = new String("helloworld");
		System.out.println(s2);
		//����Ĺ��췽ʽ��ֱ�Ӹ�ֵ
		String s3 = "hello";
		/*��Ϊ�ַ�������or �ַ��������� ͨ�����캯��new
		 * һ��������µĿռ䡣 ͨ��ֱ�Ӹ�ֵ�ķ�ʽ����һ�������µĿռ�
		 * ��ʵ��һ�����ģʽ����Ϊ��Ԫģʽ
		 */
		String s4 = "hello";
		System.out.println(s3==s4);
		/*
		 * ��Ϊ��һ���ַ����ص��ڴ�ռ䣬������ַ�������
		 * ÿ�Σ������ȴ��ַ����������Ƿ��иó�������
		 * �����ֱ�����ã����û�У��µĿռ䣬Ȼ������
		 */
		
		String s5 = "a" +"b" +"c";//ֱ�ӵȼ���"abc"; jvm�Զ��Ż���
		String s6 = "abc";
		System.out.println(s5==s6);
		String s7 = 1+2+3+"abc";//6abc
		System.out.println(s7);
		String s8 = "abc"+1+2+3;//abc123
		
		String s9 = "hello"+"world";
		String s10 = "helloworld";
		System.out.println(s9==s10);
		String s11 = s4+"world";//new StringBuilder(s4).append("world");
		
		System.out.println(s10==s11);
	}

}
