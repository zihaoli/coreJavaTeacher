package lesson3;

public class Demo5 {
	public static void main(String[] args) {
	}
}
class P{
	public final void test(){
		a();
		b();
		c();
	}  //test��������a,b,c���˳���Ժ���Զ���ܸĶ�,���಻��ȥ��д�����Ǹ÷���ֻҪ��final���μ���
	private void a(){}
	private void b(){}
	private void c(){}
}
class P1 extends P{
	//public void test(){} ������д
}
final class Q{
	
}
/*class Q1 extends Q{
	
}*///final���ε����ǲ��ܼ̳е�

