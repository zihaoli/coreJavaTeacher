package corelesson4;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class StreamDemo6 {
	public static void main(String[] args) {
		try {
			PrintStream ps = new PrintStream(new FileOutputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\print.txt"));
			//System.out Ŀ���Ǳ�׼����豸   System.in��׼�����豸
			ps.println("helloworld");
			ps.println("bye-bye");//ps.print("hello");���������
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
