package lesson4;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo8 {
	public static void main(String[] args) {
	}
}

class A {
	public void test1() throws IOException, ClassNotFoundException {
	}
}

class B extends A {
	/*
	 * @Override public void test1() throws IOException, ClassNotFoundException,
	 * NumberFormatException { }
	 */// ����throws����Ĳ���ֻ����RuntimeException���͵Ļ������� ok
	/*
	 * @Override public void test1(){ }
	 */// throws�ȸ������ Ҳ��ok��
	/*@Override
	public void test1() throws IOException, ClassNotFoundException,
			CloneNotSupportedException {
	}*///����ģ�throws�˱ȸ���������͵��쳣��

}
