package lesson3;

public class Demo4 {
	public static void main(String[] args) {
		final int i = 10;
		//i = 11;��,final���εı���ֻ�ܸ�ֵһ��
		T t = new T(5);
		T t1 = new T(6);
		
		final M m = new M(10);//final������m mֻ�ܸ�ֵһ�Σ�ֻ��ָ�������ַ ����ָ��������ַ��
		//m = new M(20);//���
		m.setI(1000);//m��i���Բ�û����final�������Կ��ԸĶ�
		
		
	}
}
class T{
	private final int i;  //final���γ�Ա���������г�ʼ��Ҫô���캯��Ҫô��Ҫô�����ʼ����ֵ
    //��ͨ��Ա������ÿ������ӵ��һ�ݣ�����ÿ�������i��ֻ�ܸ�ֵһ��
	//private final int i = ֵ
	public T(int i ){
		this.i = i;
	}
	public int getI() {
		return i;
	}
}
class M{
	private int i ;
	public M(int i ){
		this.i = i;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
}
