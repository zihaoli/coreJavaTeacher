package lesson4;

public class Demo7 {
	public static void main(String[] args) {
		try {
			PersonA pa = new PersonA();
			pa.setAge(100);
			System.out.println(pa.getAge());
		} catch (Exception e) {
			System.out.println("���䷶Χ����ȷ");
		}
	}
}
class PersonA{
	private int age;
	/*
	 * setAge��������֮���Ǹ�����ȥ���õ�
	 * ���������õ�����ȥ������쳣
	 * �����Լ����Բ������������ڵ����
	 * �Լ������������벻ͨ��
	 * ��ôjava�ṩ������һ�ֻ��ƽ�throws 
	 * �ر��쳣���Լ�����ͨ������
	 * ����֪ʹ���߿��ܻ�����Щ�쳣������
	 * 
	 */
	public void setAge(int age)throws Exception{
		if(age<0 || age > 120)
			throw new Exception();
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
