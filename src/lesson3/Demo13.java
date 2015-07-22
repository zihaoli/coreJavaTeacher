package lesson3;

public class Demo13 {
	public static void main(String[] args) {
		Persony person = new Persony();
		person.getOneCanFly().fly();
		System.out.println("================");
		Shape s = person.getOneShape();
		s.draw();
		System.out.println(s.getLength());
	}
}
class Persony{
	public Shape getOneShape(){
		/*
		 * ���������ķ���ֵ������һ��������
		 * ���ص�һ���Ǹó����������ʵ��
		 * ֻ�������������ʹ��
		 */
		class Line extends Shape{
			private Point last;//���
			private Point end;//�յ�
			public Line(){}
			public Line(Point last,Point end){
				this.last = last;
				this.end = end;
			}
			public double getArea() {return 0;}
			public double getLength() {
				return last.getDistance(end);
			}
			public void draw() {
			    System.out.println("line draw...");
			}
		}
		return new Line(new Point(5,5),new Point(10,10));
	}
	public CanFly getOneCanFly(){
		/*
		 * ���������ķ���ֵ�����ǽӿڣ����ص���ʵ���˸ýӿڵ���Ķ���
		 * ��Ϊ���������ֻ�����������ʹ������
		 * ���ǿ���ֱ���ں����ڲ�������
		 */
		class Bird implements CanFly{
			public void fly() {
				System.out.println("bird..fly...");
			}
		}//�������������һ���������ڲ�������Ǿֲ��ڲ��ֻ࣬�ڸú�������Ч
		return new Bird();
	}
}
/*
 *   Outer$Inner.class---->��Ա�ڲ���
 *   Outer1$Inner.class---->��̬�ڲ���
 *   Persony$1Bird.class---->�ֲ��ڲ���
*/