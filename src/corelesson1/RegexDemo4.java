package corelesson1;

import java.util.Scanner;

public class RegexDemo4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//�õ绰���������1��ͷ������3or5or8����9λ
		String regex = "^1[358]\\d{9}$";
		while(true){
			System.out.println("�������ֻ�����:");
			String t = s.nextLine();
			if(t.matches(regex)){
				System.out.println(t);
				break;
			}
			System.out.println("���벻�Ϸ�������������");
		}
	}

}
