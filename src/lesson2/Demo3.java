package lesson2;

public class Demo3 {
	public static void main(String[] args) {
		Student student = new Student(1000,"zhangsan",18,"��Ӯjava1��");
		Student student2 = new Student(1000,"zhangsan",18,"��Ӯjava1��");
		/*������ʵ��Ӧ�õ���һ��ϰ�ߡ����Ĭ�϶���ͨ��
		 * equals�������Ƚ����������������true����Ϊ��ͬһ��
		 * ����false��Ϊ����
		 * 
		 * ��ʵ��Ӧ���У������������Ψһ��ʶ��
		 * ��Ӧ����Ψһ��ʶ������equals������hashCode��������ʱ��Ҫ�����������)
		 * 
		 */
		System.out.println(student.equals(student2));
		
	     System.out.println(student);
	}
}
