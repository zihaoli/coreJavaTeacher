package corelesson4;

public class EncodeDemo1 {
	public static void main(String[] args) {
		//java�����ڲ�һ���ַ�ռ�����ֽڣ�����������Ӣ�� 
		String s = "ABC��";
		byte[] b = s.getBytes();//Ĭ�ϻ�����Ŀ�ı������ת��--->GBK
		for (byte c : b) {
			System.out.print(Integer.toHexString(c & 0xFF)+" ");
		}
		System.out.println();
		System.out.println("====================");
		try {
			byte[] b1 = s.getBytes("GBK");
			for (byte c : b1) {
				System.out.print(Integer.toHexString(c&0xFF)+" ");
			}
			//gbk����1��Ӣ��ռ��һ���ֽڣ�һ������ռ��2���ֽ�
			
			System.out.println("\n======================");
			byte[] b2 = s.getBytes("utf-8");
			for (byte c : b2) {
				System.out.print(Integer.toHexString(c&0xFF)+" ");
			}
			//utf-8��������ռ�������ֽڣ�Ӣ��ռ��һ���ֽ�
			System.out.println("\n=====================");
			byte[] b3 = s.getBytes("utf-16be");
			for (byte c : b3) {
				System.out.print(Integer.toHexString(c & 0xFF)+" ");
			}
			System.out.println();
			//String ss = new String(b1);//Ĭ����Ŀ����
			String ss = new String(b1,"gbk");
			String ss1 = new String(b1,"utf-8");
			System.out.println(ss);
			System.out.println(ss1);//����
			String ss2 = new String(b2);
			System.out.println(ss2);//����
			String ss3 = new String(b2,"utf-8");
			System.out.println(ss3);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
