package corelesson4.simplefactory;

public class FruitTest {
	public static void main(String[] args) {
		/*
		 * ��һ�Ѹ��ӣ����Լ������˸��ӣ���ʵ�������ø��Ӿ�
		 * Ӧ��ȥ�����򣨻�ȡ�����ɣ��������Լ���������
		 */
		/*Apple apple = new Apple();
		apple.grow();
		apple.harvest();
		System.out.println("===============");
		Grape grape = new Grape();
		grape.grow();
		grape.harvest();*/
		//ʹ��ʹ���ߺʹ����߷���--->����ˮ����Ҫ�޸�FruitFactory�Ĵ���
	     /*Fruit fruit = FruitFactory.getInstance("grape");
		fruit.grow();
		fruit.harvest();*/
		
		Fruit fruit = FruitFactory.getInstance();
		fruit.grow();
		fruit.harvest();
	}

}
