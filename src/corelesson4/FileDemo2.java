package corelesson4;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("D:\\javalessons\\coreJava\\javaSE-oop\\lesson2");
		//listFile(file);
		//listFile1(file);
		//listFile2(file);
		//listFile3(file);
		//listFile4(file);
		listFile5(file);
	}
	public static void listFile(File file){
		/*
		 * �г���Ŀ¼�����е�Ŀ¼�����ļ��� �����г�����Ŀ¼���ƣ�
		 * Ҳ���������Ŀ¼
		 */
		String[] filenames = file.list();
		for (String string : filenames) {
			System.out.println(file.getAbsolutePath()+"\\"+string);
		}
		System.out.println("==============");
		//ֱ���г�Ŀ¼�µģ���������File����
		File[] files = file.listFiles();
	    for (File file2 : files) {
			System.out.println(file2.getAbsolutePath());
		}
	}
	/**
	 * �ܹ�����file��file��Ŀ¼�µ���������
	 * @param file
	 */
	public static void listFile1(File file){
		File[] files  = file.listFiles();
		for (File file2 : files) {
			if(file2.isFile()){//������ļ�
				System.out.println(file2.getAbsolutePath());
			}else if(file2.isDirectory()){//�����Ŀ¼ ���еݹ����
				listFile1(file2);
			}
		}
	}
	public static void listFile2(File file){
		//String[] filenames = file.list(new MyFileNameFilter());
		String[] filenames = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".java");
			}
		});
		for (String string : filenames) {
			System.out.println(file.getAbsolutePath()+"/"+string);
		}
	}
	static class MyFileNameFilter implements FilenameFilter{
		//file�г���ÿ���ļ���Ҫ����accept����������true���£�false������
		@Override
		public boolean accept(File dir, String name) {
			//File dir ����Ŀ¼     name����ֱ���ӵ��������ļ���orĿ¼��
			//System.out.println(dir.getAbsolutePath()+" ... "+name);
			return name.endsWith(".java");
		}
		
	}
	public static void listFile3(File file){
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				// pathname ����file�µ�ÿ���ļ�orĿ¼
			//	System.out.println(pathname);
				return pathname.getAbsolutePath().endsWith(".java");
			}
		});
		System.out.println("=======================");
		for (File file2 : files) {
			System.out.println(file2.getAbsolutePath());
		}
	}
	//�ݹ��ó�.java�ļ���������Ŀ¼�µ�
	public static void listFile4(File file){
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
			    if(pathname.isFile())
				return pathname.getAbsolutePath().endsWith(".java");
			    else if(pathname.isDirectory())
			    	listFile4(pathname);
			    return true;
			    
			}
		});
		for (File file2 : files) {
			if(file2.isFile())
			System.out.println(file2.getAbsolutePath());
		}
		
	}
	public static void listFile5(File file){
		File[] files = file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				//System.out.println(dir.getAbsolutePath()+" ...  "+name);
				File file1 = new File(dir,name);
				if(file1.isFile())
					return name.endsWith(".java");
				else if(file1.isDirectory())
					listFile5(file1);
				return true;
			}
		});
		for (File file2 : files) {
			if(file2.isFile())
			System.out.println(file2.getAbsolutePath());
		}
	}
}
