package corelesson8;


public class EnumDemo {

	public static void main(String[] args) {
		WeekDay2 day2 = WeekDay2.FRI;
		System.out.println("============");
		//ö���౾���ṩ��һЩ����
		WeekDay2[] ws = WeekDay2.values();
		for (WeekDay2 weekDay2 : ws) {
			System.out.println(weekDay2);//toStringĬ�Ͼ���ö�ٶ��������
		}
		System.out.println("===================");
		WeekDay2 d1 = WeekDay2.valueOf("MON");
		System.out.println(d1);
		//switch case�﷨�п���ʹ��byte short int long ��ö������
		System.out.println("====================");
		switch (d1) {
		case FRI:
			System.out.println("fri");
			break;
		case MON:
			System.out.println("mon");
			break;
		case SUN:
			System.out.println("sun");
			break;
		}
		System.out.println("====================");
		WeekDay3 d = WeekDay3.MON;
		System.out.println(d.nextDay());
	}

}
