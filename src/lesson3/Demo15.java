package lesson3;

public class Demo15 {
	public static void main(String[] args) {
	   Personw person = new Personw();
	   /*���÷���ʱ�����ֲ�����һ���ӿ�
	    * ��ô���ݵľ���ʵ���˸ýӿڵ���Ķ���
	    * ��֪���ӿڣ���ȡ��ʵ����Ķ���
	    * ����ֱ����������Ķ���
	     */
		person.playFly(new CanFly() {

		@Override
		public void fly() {
			System.out.println("plane ...flying...");
		}
	   });
		System.out.println("======================");
		/*
		 * ������һ�������࣬��ôҪ���ݵ��Ǹ�������Ķ���
		 * ��֪���࣬��ȡ������Ķ���
		 * ��������������
		 */
		person.playDraw(new Shape(){
			public double getArea() {return 0;}
			public double getLength() {	return 0;}
			public void draw() {
				System.out.println("drawing...shape...");
			}
		});
	}
}
class Personw{
	public void playFly(CanFly fly){
		fly.fly();
	}
	public void playDraw(Shape shape){
		shape.draw();
	}
}
