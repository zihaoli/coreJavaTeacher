package lesson4;

public class Demo3 {
	public static void main(String[] args) {
         try {
     	    int a = Integer.parseInt(args[0]);
    		int b = Integer.parseInt(args[1]);
    		System.out.println(a/b);
		}catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("�����±�Խ����!");
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ0��");
		}catch(Exception e){
			System.out.println("�����쳣");
		}
	}
}
