package corelesson5;

public class Single {
	private static Single instance = null;
	private Single(){}
	/**
	 * ���̲߳�������������ܱ�֤������ģʽ
	 * @return
	 */
	public synchronized static Single getInstance(){
		if(instance==null){
			instance = new Single();
		}
		return instance;
	}
	
}
