package corelesson4;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StremDemo4 {
	public static void main(String[] args) {
		//write();
		read();
	}

	public static void write() {
		try {
			// ��1.txt�ļ���Ϊ�ֽ������������ֱ�ӿ���дjava����������
			/*
			 * DataOutputStream dos = new DataOutputStream( new
			 * FileOutputStream("d:\\1.txt"));
			 */
			// ��1.txt�ļ���Ϊ�ֽ��������������д�뻺���������ҿ���ֱ��дjava����������
			/*
			 * DataOutputStream dos1 = new DataOutputStream( new
			 * BufferedOutputStream( new FileOutputStream("d:\\1.txt")));
			 */

			// �������⹦�ܵ����඼���л�����������Ƕ�׹����������ʵ��װ��ģʽ
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\data.txt"));
		    /*
		     * �����FileOutputStream out
		     * out.write(10000); write����ֻ��дһ���ֽ� 
		     * ����10000 ��32���ֽڣ�������ֻ��д��8λ
		     * DataOutputStream dos�����writeInt
		     * ����һ��������out�����write����д4��ÿ��д8λ
		     * writeInt�ڲ�һ����
		     * out.write(10000>>24)
		     * out.write(10000>>16)
		     * out.write(10000>>8)
		     * out.write(10000)
		     */
			dos.writeInt(1000);
			dos.writeBoolean(true);
			dos.writeDouble(10.03);
			dos.writeUTF("helloworld");
			dos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void read() {
		try {
			DataInputStream dis = new DataInputStream(new 
					FileInputStream("D:\\javalessons\\coreJava\\javaSE-core\\data.txt"));
			/*
			 * readInt��������
			 * InputStream ��read��4��Ȼ��ƴ��
			 * ��Դ��
			 */
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
