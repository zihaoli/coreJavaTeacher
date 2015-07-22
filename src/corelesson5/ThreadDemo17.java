package corelesson5;


public class ThreadDemo17 {
	public static void main(String[] args) {
		Send send = new Send();
		Rec rec = new Rec(send);
		Thread t1 = new Thread(send);
		Thread t2 = new Thread(rec);
		t1.start();
		t2.start();
	}
}
class Send implements Runnable{
	boolean flag;
	int theValue;
	@Override
	public void run() {
		for(int i = 1; i <= 50;i++){
			synchronized (this) {
				while(flag){
					try {
						this.wait();//wait���ͷ�ͬ����Կ��
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for(int j = 1; j <= 10;j++){
					System.out.println("A�߳�ѭ��"+j+"��");
				}
				flag = true;
				//����������
				this.notify();
			}
		}
	}
}
class Rec implements Runnable{
	private Send send;
	public Rec(Send send) {
		super();
		this.send = send;
	}
	@Override
	public void run() {
		//��֪�������������˶���ʳ������������Ѷ���
		for(int i = 1; i <= 50;i++){
			synchronized (send) {
				while(!send.flag){
					try {
						send.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			   for(int j = 1; j <= 20;j++){
				   System.out.println("B�߳�ѭ��"+j+"��");
			   }
				send.flag = false;
				send.notify();
			}
		}
	}
}
