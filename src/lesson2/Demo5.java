package lesson2;

public class Demo5 {
	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.f());
		//System.out.println(d.g());
	}
}
class C{
	public int i = 27;
	//public int f(){return i;}
	public int f(){return this.g();}
	private int g(){return i;}//��private����public���Խ��
}
class D extends C{
	public int i = 47;
	public int g(){return i;}   
	//public int g(){return super.i}
	//������ֱ�ӷ��ʵ�i���������Լ�������
	//����̳й����ı���ͨ������ļ̳й����ķ������ʻ���super
}
