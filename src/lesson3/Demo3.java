package lesson3;
public class Demo3 {
	public static void main(String[] args) {
		Question[] qs = new Question[2];//������û��ʵ������ô���������õĶ����������ʵ������
		SingleQuestion question1 = new SingleQuestion(1, "�����ǰ����Ӱ����:",
				new String[] { "A.ʧ��33��", "B.������" }, "A");
		MutilQuestion question2 = new MutilQuestion(1, "������ս����ĵ�Ӱ����:",
				new String[] { "A.��Ը��", "B.��������սʿ","C.������" },new String[]{ "B","C"});
		qs[0]  =  question1;
	    System.out.println(qs[0].check(new String[]{"A"}));
		qs[1] =  question2;
		System.out.println(qs[1].check(new String[]{"B","C"}));
		
	}
}
