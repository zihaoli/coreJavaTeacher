package corelesson4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo1 {
	public static void main(String[] args) {
		// test1();
		 //test2();
		//test3();
		test4();
	}

	// ���е�IO��������IOException����
	public static void test1() {
		try {
			FileInputStream in = new FileInputStream(
					"D:\\javalessons\\coreJava\\javaSE-oop\\lesson2\\Demo1.java");
			// ���1.txt������ֱ�Ӵ��������ڻ�ɾ��Ȼ���ٴ���
			FileOutputStream out = new FileOutputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\2.txt");

			int c;
			/*
			 * ����1�����ڵ��ֽڱ����ַ���û�����⣬ ����һ���ַ�ռ�ö���ֽڵ�����ֱ�Ӵ�ӡ�������� ����2�� ���ڱȽϴ���ļ���ȡЧ�ʱȽϵ�
			 */
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
				out.write(c);
			}
			in.close();// �����finally��ȥ�ر�
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void test2() {
		try {
			// ��ݼ� ѡ������ctrl+/
			// FileInputStream in = new FileInputStream(
			// "D:\\javalessons\\coreJava\\javaSE-oop\\lesson2\\Demo1.java");
			// FileOutputStream out = new FileOutputStream(
			// "D:\\javalessons\\coreJava\\javaSE-core\\3.txt");
			FileInputStream in = new FileInputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\a.jpg");
			FileOutputStream out = new FileOutputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\b.jpg");
			byte[] b = new byte[1024 * 5];
			/*
			 * ��b�ֽ������зţ��ӵ�0��λ�ÿ�ʼ����b.length�� ���ص��Ƕ�ȡ���ֽڵĸ���
			 */

			/*
			 * int bytes = in.read(b,0,b.length);//������ȡЧ�ʽϸ� String s = new
			 * String(b,0,bytes); System.out.println(s);
			 */
			// long start = System.currentTimeMillis();
			int bytes;
			// ��ȡ����ļ�����ʹ�����ַ�ʽ
			while ((bytes = in.read(b, 0, b.length)) != -1) {
				String s = new String(b, 0, bytes);
				System.out.print(s);
				out.write(b, 0, bytes);
			}
			// long end = System.currentTimeMillis();
			// System.out.println(end - start);
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void test3() {
		try {
			FileInputStream in = new FileInputStream(
					"D:\\javalessons\\coreJava\\javaSE-oop\\lesson2\\Demo1.java");
			FileOutputStream out = new FileOutputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\4.txt");
			int length = in.available();// ���صĿɶ����ֽ���
			/*
			 * ����ļ��ܴ󣬿��ٵ��ڴ�ռ��̫����Ҳ������ ���鶼��test2�����еķ�ʽ��ȡ�ļ�
			 */
			byte[] b = new byte[length];
			in.read(b);
			String s = new String(b);
			System.out.println(s);
			out.write(b);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static void test4(){
    	try {
			FileInputStream in = new FileInputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\aa.txt");
			
			FileOutputStream out = new FileOutputStream(
					"D:\\javalessons\\coreJava\\javaSE-core\\bb.txt");
			byte[] b = new byte[1000];
			int bytes = in.read(b,0,b.length);
			/*
			 * aa.txt�ļ���utf-8������ֽ����У�ת�����ַ���
			 * ʱҪ��utf-8
			 */
			String s = new String(b,0,bytes,"utf-8");
			System.out.println(s);
			out.write(b,0,bytes);
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
