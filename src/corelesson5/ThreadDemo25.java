package corelesson5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo25 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello");
			}
		}).start();
		
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		threadPool.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("bye-bye");
			}
		});
		/*
		 * ����ǰ��������ִ��������run������ʵ�ֵ�����
		 * run������û�з���ֵ�ġ�
		 * ���ǲ���֪���߳�ʲôʱ��ִ�н���
		 * ����߳�ִ�������ܷ���һ��ֵ����ô���Ǿ�֪���߳��Ѿ����н�����
		 * java5���ṩ���߳�ִ����������ִ�з��ؾ����ֵ��
		 */
		threadPool.shutdown();
		System.out.println("======================");
		ExecutorService threadPool1 = Executors.newSingleThreadExecutor();
		//Callable<T>    ���͵ľ������;��Ƿ���ֵ������  Ҳ������Futuer��������
		Future<Integer> future = threadPool1.submit(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception { //����
				System.out.println("����ʼ");
				Thread.sleep(3000);
				System.out.println("�������");
				return 10;
			}
		});
		
		int value = 0;
		try {
			value = future.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(value);
		
		
	}

}
