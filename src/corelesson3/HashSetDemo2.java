package corelesson3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
	public static void main(String[] args) {
		Student stu1 = new Student("001","zhangsan",22);
		Student stu2 = new Student("002", "lisi", 23);
		Student stu3 = new Student("003","wangwu",22);
		HashSet<Student> students = new HashSet<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
	    System.out.println(students.size());
	    stu1.setNo("000x");//�޸ĸ����Ժ󣬶����Ƴ�����
	    students.remove(stu1);
	    System.out.println(students.size());
	    /*
	     * HashSet���Ԫ�ص�ʱ��Ԫ�ص�λ��
	     * �ǺͶ���hashCode�㷨�õ���ֵ��صġ�
	     * ��ôȥ����Ԫ��ʱ��ҲҪ��������㷨��ֵ
	     * Ȼ���ҵ����λ�ã��Ƴ�Ԫ�أ����
	     * û��Ԫ�ش���remove��������false
	     * ��������㷨��ص�����ֵ�ڷ����������޸��ˣ�
	     * ��ζ��hashCode�㷨�õ���ֵ��֮ǰ��������
	     * ʱ��һ���ˣ��Ҷ����λ�þͷ����˸ı䣬�Ӷ�
	     * �Ҳ���֮ǰ�Ķ��󣬵���Ԫ�ز����Ƴ���
	     * �ö���֮������ڴ�й¶
	     */
	}

}
