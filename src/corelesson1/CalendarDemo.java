package corelesson1;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		//test1();
		//test2();
		test3();
	}

	private static void test1() {
		//Calendar�ǳ����࣬��ȡ����������Ķ���
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		//��ȡ���и�ʱ����ͬ����Ϣ
	}
	private static void test2(){
		String s = "1998-10-10";
		Date date = DateDemo.stringToDate(s);
		Calendar c = Calendar.getInstance();
		//c.setTime(date);
		c.setTimeInMillis(date.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		
	}
	//�����Ӷ���ڣ���ȡת������--->������ת��
	private static void test3(){
		//��Ӷ����
	    String s = "1998-10-10";
	    Date date = DateDemo.stringToDate(s);
	    Calendar c = Calendar.getInstance();
	    c.setTime(date);
	    //ת������
	    c.add(Calendar.MONTH, 3);
	    int y = c.get(Calendar.YEAR);
	    int m = c.get(Calendar.MONTH)+1;
	    int d= c.get(Calendar.DATE);
	    System.out.println("ת��������:"+y+"-"+m+"-"+d);
	    
	    
	}
}
