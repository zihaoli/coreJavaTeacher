package corelesson2;

public class Office {
	public static void main(String[] args) {
		try {
			//��ȡ�����ͣ�Ҳ�Ƕ�̬�����࣬������ʱ�̼���
			Class c = Class.forName(args[0]);
			//������Ķ���
			OfficeAble oa = (OfficeAble)c.newInstance();
			//���÷���
			oa.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
