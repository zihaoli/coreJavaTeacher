package corelesson5;

public class ThreadDemo22 {
	public static void main(String[] args) {
		/*
		 * ������10���̣߳�ִ����10������--->��ϣ������ֹ�Ĵ����߳�
		 * �����ж������񶼽����̶����߳������߳���ִ���������
		 * ������һ���߳���ִ�ж������
		 */
		
		

		for(int i = 1; i <= 10;i++){
			final int task = i;
			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("����"+task);
				}
			}).start();
		}
	}

}
