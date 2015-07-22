package corelesson4;

import java.io.File;
import java.io.IOException;


public class FileDemo1 {
	public static void main(String[] args) {
		File file = new File("D:\\javalessons\\coreJava\\javaSE-core");
		System.out.println(file.exists());//true����Ŀ¼����false��������
		//File file1 = new File("D:\\javalessons\\coreJava\\javaSE-core\\aa");
		//File file1 = new File(file,"aa");
		File file1 = new File("D:\\javalessons\\coreJava\\javaSE-core","aa");
		if(!file1.exists())
			file1.mkdir();//����Ŀ¼  mkdirs
		else
			file1.delete();//ɾ��Ŀ¼
		System.out.println(file1.isDirectory());//�ж��Ƿ���һ��Ŀ¼�����Ŀ¼������Ҳ����false
		System.out.println(file1.isFile());//�ж��Ƿ���һ���ļ�
		System.out.println("=====================");
		File file2 = new File("D:\\javalessons\\coreJava\\javaSE-core\\Excel.java");
		System.out.println(file2.isFile());
		System.out.println(file2.exists());
		File file3 = new File(file,"1.txt");
		if(!file3.exists())
			try {
				file3.createNewFile();//�����ļ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		else
			file3.delete();
		
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		
		System.out.println("=============");
		System.out.println(file.getName());
		System.out.println(file2.getName());
		System.out.println("===============");
		System.out.println(file.getParent());//�õ���Ŀ¼�ַ���
		System.out.println(file2.getParent());
		System.out.println("==================");
		//getParentFile()�õ���Ŀ¼��File����
		System.out.println(file.getParentFile().getAbsolutePath());
		System.out.println(file2.getParentFile().getAbsolutePath());
	}

}
