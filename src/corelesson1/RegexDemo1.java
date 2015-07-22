package corelesson1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
	public static void main(String[] args) {
		String s = "xxab+defab+xyzab+dddab+nnn";
		//Ҫ��ab+���ָ��ַ���
		String[] ss = s.split("ab\\+");//���ab+����a�����bb���Գ���һ�λ��߶��
		/*������ʽ.  *  +   ? ����������  ���ܵ�����ʾ���ǣ����
		 * ��Ҫ��ʾ����Ҫ��\
		 * ��java��\���ַ�����Ҫ��\\��ʾ
		 * ����Ҫ��ʾ�����ĸ��ַ���Ӧ����\\.��\\+��\\?��\\*
		 * �����ת����������������
		 */
		System.out.println(Arrays.toString(ss));
		
		System.out.println("================");
		String regex = "ab\\+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		//�ж�һ���ַ����Ƿ�ƥ��һ��������ʽ
		System.out.println(matcher.matches());
		System.out.println(s.matches(regex));
		//��һ���ַ������ҳ�ƥ��������ʽ��Ԫ��
		while(matcher.find()){
			System.out.println(matcher.group());
		}
	}

}
