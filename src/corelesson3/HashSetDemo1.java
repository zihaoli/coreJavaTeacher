package corelesson3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	public static void main(String[] args) {
		Student stu1 = new Student("001","zhangsan",22);
		Student stu2 = new Student("002", "lisi", 23);
		Student stu3 = new Student("003","wangwu",22);
		HashSet<Student> students = new HashSet<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		System.out.println(students.size());
		System.out.println(students);
		System.out.println("================");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("===============");
		Iterator<Student> itor = students.iterator();
		while(itor.hasNext()){
			System.out.println(itor.next());
		}
		System.out.println("=================");
		
		//students.add(stu3);�����ظ�Ԫ�ػ��Զ����˼Ӳ���ȥ
		System.out.println(students.size());
		
		Student stu4 = new Student("003","wangwu",22);
		System.out.println(stu3.equals(stu4));
		/*�ظ�Ԫ�ص������ȥ����
		 * stu3/stu4��������ʱ����������
		 * ����ʵ��Ӧ������ͬһ��ѧԱ
		 * ����������б�����Ψһ��ʶ�������������д
		 * equals��hashCode����
		 * hashCode������һ��ɢ���㷨�����ڲ��ù������ȥд
		 * ����HashSet�����ݵĴ����ֱ�ӹ�ϵ
		 */
		students.add(stu4);
		System.out.println(students.size());
	}

}
