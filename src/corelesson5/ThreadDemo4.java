package corelesson5;

public class ThreadDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello");
			}
		});
		System.out.println(t1.getName());
		t1.setName("�߳�1");
		System.out.println(t1.getName());
		//��õ�ǰ�߳�   ����Ӧ�̵߳�����
		System.out.println(Thread.currentThread().getName());
		//����߳�û���������ȼ�Ĭ����5��    ֻ����1����10��֮��
		System.out.println(t1.getPriority());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
	}

}
