package corelesson1;

import java.util.Scanner;

public class RegexDemo3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String regex = "^[a-zA-Z]\\w{4,9}$";
		while(true){
			System.out.println("�������û���������������ĸ��ͷ��" +
					"���Ը�������ĸ_ ����5��10");
			String name = s.nextLine();
			if(name.matches(regex)){
				System.out.println(name);
				break;
			}
			System.out.println("������û������Ϸ�����������");
		}
	}

}
