package lesson3;

public class Demo14 {
	public static void main(String[] args) {
		PersonZ pz = new PersonZ();
		pz.getOneCanFly().fly();
		System.out.println("=====================");
		pz.getOneShape().draw();
	}
}
class PersonZ{
	public CanFly getOneCanFly(){
		//���ص������ǽӿڣ���ôҪ��ȡʵ���˸ýӿڵ����ʵ��
		//�������� ��֪�ӿڻ�ȡʵ���˸ýӿڵ���Ķ���
		return new CanFly(){
			@Override
			public void fly() {
				System.out.println("bird fly...");
			}
		};
	}
	public Shape getOneShape(){
		/*
		 * ����ֵ������һ�������࣬��ô���ص��Ǹó����������ʵ��
		 * ��֪�����ȡ������Ķ���
		 * ����ֱ��ʹ��������Ķ���
		 */
		return new Shape(){
			@Override
			public double getArea() {return 0;}
			public double getLength() {return 0;}
			@Override
			public void draw() {
				System.out.println("draw ..shape...");
			}
		};
	}
}
