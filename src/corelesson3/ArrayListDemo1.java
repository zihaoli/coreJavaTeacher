package corelesson3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		Product product1 = new Product("001", "��Ӯjava�γ�", 10000);
		Product productx = new Product("001", "��Ӯjava�γ�", 10000);
		Product product2 = new Product("002","��Ӯandroid�γ�",12000);
		Product product3 = new Product("003","��Ӯui�γ�",9000);
		ArrayList list = new ArrayList();//���������κζ���
		//���Ԫ��
		list.add(product1);
		list.add(product2);
		list.add(product3);
		//�鿴��ЧԪ�صĸ���
		System.out.println(list.size());
		//ֱ�Ӵ�ӡ���϶��󣬻��ӡ���������ɵ�ÿ�������toString
		System.out.println(list);
		//��ȡĳ��Ԫ�أ����������±��ȡ
		Product product = (Product)list.get(0);
		System.out.println(product);
		//System.out.println(list.get(8)); 8���λ����û��Ԫ�� ���׳������±�Խ����쳣
		//list.add(5,product1);�����±�Խ����Ϊǰ�����3��Ԫ�أ����Ԫ��ֻ�ܷ���0,1,2,3���4��λ��
	    /* list.add(2,product1);//list�����п��������ظ���Ԫ��
	     System.out.println(list);*///�����൱���������в���Ԫ��
		System.out.println("=======================");
		//����
		for(int i = 0; i < list.size();i++){
			Product pro = (Product)list.get(i);
			System.out.println(pro);
		}
		System.out.println("===================");
		/*ͨ������������
		 * �����һ���ۼ�����Ӧ���ṩ
		 * ���ʾۼ���ĳ��Ԫ�غͱ�������Ԫ�صķ�ʽ
		 * ���Ҳ���¶���ϵ�ʵ��
		 * 
		 * ���������ģʽ
		 * ArrayList���Ѿ��ṩ�˵�����
		 * java.util.Iterator
		 */
		Iterator itor = list.iterator();
		while(itor.hasNext()){
			Product pro = (Product)itor.next();
			System.out.println(pro);
		}
		System.out.println("==================");
		//foreach����
		for(Object object : list){
			Product pro = (Product)object;
			System.out.println(pro);
		}
	   
		//�ж�ĳ��Ԫ���Ƿ�����ڼ�����--->true
		System.out.println(list.contains(product1));
		/*--->false���󴴽�������������ʵ��Ӧ��������������Ӧ����ͬһ����
		 * ��ʵ��Ӧ���г��룬��ν�������ǿ�Դ�롣
		 * list������contains������ʵ�����Ĵ����ʵ�ʲ���
		 * �ͼ����е�Ԫ�ؽ���equals�Ƚ����ж��Ƿ����
		 * equals����Object���бȽϵ�����������ĵ�ַ
		 * ����ʵ��Ӧ��������һ����Ϊequals����true
		 * ����������ͬ�Ķ�������ʵ��Ӧ����Ӧ��
		 * ����ʵ�������дequals����
		 */
		
		System.out.println(list.contains(productx));
		System.out.println(product1.equals(productx));
		System.out.println("====================");
		//�Ƴ�Ԫ��
		//list.remove(0);//���ص��Ǳ��Ƴ��Ķ���
		list.remove(product1);
		System.out.println(list);
		
		
	}

}
