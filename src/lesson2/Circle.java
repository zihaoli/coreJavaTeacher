package lesson2;

public class Circle extends Shape{
	/*java�еļ̳���ȫ���̳У���ʹprivate Ҳ�̳� 
	 *private �̳й���֮����ֱ�ӷ��ʣ�ֻ��ͨ��
	 *�̳й����ĸ���ķ�private ��������
	 */
	private double r;
	public Circle(Point Location,double r) {
		super(Location);
		this.r = r;
	}
	public double getArea(){
		return 3.14 * r * r;
	}
	public double getLength(){
		return 2 * 3.14 * r;
	}
	public boolean contains(Point p){
		return this.getLocation().getDistance(p)<=r;
	}
	 public void printData() {
		// TODO Auto-generated method stub
		super.printData();
		System.out.println("�뾶��:"+r);
	}
}
