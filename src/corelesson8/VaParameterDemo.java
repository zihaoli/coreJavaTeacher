package corelesson8;

public class VaParameterDemo {
	public static void main(String[] args) {
		/*System.out.println(add(new int[]{}));
		System.out.println(add(new int[]{1}));
		System.out.println(add(new int[]{1,2,3,4}));*/
		System.out.println(add());
		System.out.println(add(1));
		System.out.println(add(1,2));//�����add(int,int)������ֱ�Ӻ͸÷���ƥ��
		System.out.println(add(1,2,3,4));
		System.out.println(add(new int[]{1,2,3,4,5}));
	}
	//дһ���ӷ�ϣ��������������������
	/*public static int add(int[] a){
		int sum = 0;
		for(int i = 0; i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}*/
	//... �������鴦��jvm��ֱ����Ϊ����һ������
	public static int add(int ... a){
		int sum = 0;
		for(int i = 0 ; i < a.length;i++){
			sum += a[i];
		}
		return sum;
	}
	//һ������ֻ����һ���ɱ�������ҿɱ��������������һ������
   public static void print(int a,double ...d){
	   
   }
   //���ص�ʱ�����ȷ��ƥ��
  public static int add(int a,int b){
	  return a+b;
  }

}
