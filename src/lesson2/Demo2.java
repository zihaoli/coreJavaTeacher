package lesson2;

public class Demo2 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 10;
		A a2 = new A();
		a2.i = 10;
		/*
		 * a1Ϊʲô�ܵ���equals����
		 * java.lang.Object����һ����ĸ���
		 * Object���еķ����ͼ̳е���A����
		*/
		System.out.println(a1.equals(a2));
		
		System.out.println(a1);
		//��ӡ����ֱ�Ӵ�ӡ�����toString�����ķ���ֵ
		System.out.println(a1.toString());
		
	}
}
class A{
	int i ;
	/*
   public boolean equals(Object obj) {
        return (this == obj);
    }
	 */
	/*public boolean equals(A aa){
		return this.i == aa.i;
	}  */ //�͸���̳й����ķ������������أ��ͽ�ԭ��
	public boolean equals(Object obj){
		//return true;
		//A xx = (A)obj;//�������ĵ�ȷ��A����ʵ�������þͿ���ת��
		if(obj instanceof A){
			A xx = (A)obj;
			return this.i==xx.i;
		}
		return false;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return i+"";
	}
	
}
