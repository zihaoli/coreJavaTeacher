package io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
	/**
	 * �г�ָ��Ŀ¼�£���������Ŀ¼���������ļ�
	 * 
	 * @param dir
	 * @throws IOException
	 */
	public static void listDirectory(File dir) throws IOException {
		if (!dir.exists()) {
			throw new IllegalArgumentException("Ŀ¼��" + dir + "������");
		}

		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "����Ŀ¼");
		}
		File[] subs = dir.listFiles();
		if (subs != null && subs.length > 0) {
			for (File sub : subs) {
				if (sub.isDirectory()) {
					listDirectory(sub);
				} else {
					System.out.println(sub);
				}
			}
		}

	}

	private static List<File> listFile(File dir, FileFilter ff,
			boolean recursive) {
		List<File> list = new ArrayList<File>();
		File[] subs = dir.listFiles(ff);
		if (subs != null && subs.length > 0) {
			for (File sub : subs) {
				if (sub.isFile()) {
					list.add(sub);
				} else if (recursive) {
					list.addAll(listFile(sub, ff, true));
				}
			}
		}
		return list;
	}

	/**
	 * 
	 * 
	 * @param dir
	 * @param extensions
	 * @param recursive
	 * @return
	 */
	public static List<File> listFile(File dir, final String[] extensions,
			boolean recursive) {
		if (!dir.exists()) {
			throw new IllegalArgumentException("Ŀ¼��" + dir + "������");
		}

		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "����Ŀ¼");
		}

		//
		FileFilter ff = null;
		if (extensions == null || extensions.length == 0) {
			ff = new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					return true;
				}
			};
		} else {
			ff = new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					if (pathname.isDirectory())
						return true;
					String name = pathname.getName();
					for (String ext : extensions) {
						if (name.endsWith(ext)) {
							return true;
						}
					}
					return false;
				}
			};
		}

		return listFile(dir, ff, recursive);

	}

	/**
	 * ��չ����
	 * 
	 * @param dir
	 * @param filename
	 * @param recursive
	 * @return
	 */
	public static List<File> listFile(File dir, final String filename,
			boolean recursive) {
		if (!dir.exists()) {
			throw new IllegalArgumentException("Ŀ¼��" + dir + "������");
		}

		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "����Ŀ¼");
		}

		//
		FileFilter ff = null;
		if (filename == null || filename.length() == 0) {
			ff = new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					return true;
				}
			};
		} else {
			ff = new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					if (pathname.isDirectory())
						return true;
					String name = pathname.getName();
					if (name.indexOf(filename) != -1)
						return true;
					else
						return false;
				}
			};
		}

		return listFile(dir, ff, recursive);

	}

	
	/**
	 * ɾ��ָ��Ŀ¼�����������������
	 * 
	 * @param dir
	 * @throws IOException
	 */
	public static void deleteDirectory(File dir) throws IOException {
		if (!dir.exists()) {
			throw new IllegalArgumentException("Ŀ¼��" + dir + "������");
		}

		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "����Ŀ¼");
		}

		File[] subs = dir.listFiles();
		if (subs != null && subs.length > 0) {
			for (File sub : subs) {
				if (sub.isDirectory()) {
					deleteDirectory(sub);
				} else {
					System.out.println(sub);
					if (!sub.delete()) {
						throw new IOException("�޷�ɾ���ļ���" + sub);
					}
				}
			}
		}
		System.out.println(dir);
		if (!dir.delete()) {
			throw new IOException("�޷�ɾ��Ŀ¼��" + dir);
		}
	}

	/**
	 * 
	 * @param src
	 * @param dest
	 */
	public static void copyFile(File srcFile, File destFile) throws IOException {
		if (!srcFile.exists()) {
			throw new IllegalArgumentException("�ļ���" + srcFile + "������");
		}
		if (!srcFile.isFile()) {
			throw new IllegalArgumentException(srcFile + "�����ļ�");
		}
		RandomAccessFile srcRaf = new RandomAccessFile(srcFile, "r");
		if (!destFile.exists()) {
			if (!destFile.createNewFile())
				throw new IOException("�޷������ļ���" + destFile);
		}
		RandomAccessFile destRaf = new RandomAccessFile(destFile, "rw");
		byte[] buffer = new byte[8 * 1024];
	
		int len = -1;
		while ((len = srcRaf.read(buffer)) != -1) {
			destRaf.write(buffer, 0, len);
		}
		srcRaf.close();
		destRaf.close();
	}

	/**
	 * 
	 * @param srcDir
	 * @param destDir
	 * @throws IOException
	 */
	public static void copyDirectory(File srcDir, File destDir)
			throws IOException {
		if (!srcDir.exists()) {
			throw new IllegalArgumentException("�ļ���" + srcDir + "������");
		}
		if (!srcDir.isDirectory()) {
			throw new IllegalArgumentException(srcDir + "����Ŀ¼");
		}
		if (!destDir.exists()) {
			if (!destDir.mkdir())
				throw new IOException("�޷�����Ŀ¼��" + destDir);
		}
		File[] subs = srcDir.listFiles();
		if (subs != null && subs.length > 0) {
			for (File sub : subs) {
				if (sub.isFile()) {
					copyFile(sub, new File(destDir, sub.getName()));
				} else if (sub.isDirectory()) {
					copyDirectory(sub, new File(destDir, sub.getName()));
				}
			}
		}
	}

}
