package corelesson5;

public class ThreadDemo6 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
		for(int i = 1; i <=10;i++){
			try {
				t1.sleep(10000);//���߳�sleep10��//Thread.sleep(10000);
				//�ĸ��߳�ִ�е�sleep�����ĸ��߳̾�ȥsleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("world");
		}
	}
}
class MyThread1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i= 1;i<=10;i++){
			
			System.out.println(i);
		}
	}
}
