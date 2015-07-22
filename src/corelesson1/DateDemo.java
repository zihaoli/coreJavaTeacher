package corelesson1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		//test1();
		//test2();
		//System.out.println(formatDate(new Date()));
		String s = "1998-10-10";
		Date date = stringToDate(s);
		System.out.println(date);
		System.out.println(date.getTime());
	}

	public static void test1() {
		Date date = new Date();
		System.out.println(date);
		// ��1900��Ϊ������ʼ��
		System.out.println(date.getYear() + 1900);
		// month��0��11����1�µ�12��
		System.out.println(date.getMonth() + 1);
		System.out.println(date.getDate());
		// ��ʱ�ķ�����Ҫȥʹ����

		// ������ 1970 �� 1 �� 1 �� 00:00:00 GMT ������ Date �����ʾ�ĺ�������
		System.out.println(date.getTime());
		// System.out.println(System.currentTimeMillis());
	}

	public static void test2() {
		Date date = new Date();
		System.out.println(date);
	}

	public static String formatDate(Date date) {
		//MM�����¡�������֡�������������Сʱ�ơ����ȣȴ�����Сʱ��
		/*SimpleDateFormat sdf = new 
				  SimpleDateFormat("yyyy-MM-dd hh:mm:ss");*/
		SimpleDateFormat sdf = new 
				 SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    return sdf.format(date);
	}
	public static Date stringToDate(String string){
		//���ú������������ַ��������SimpleDateFormat�еĸ�ʽ��ͬ
		SimpleDateFormat sdf = new 
				  SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(string);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
