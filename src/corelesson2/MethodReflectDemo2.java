package corelesson2;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MethodReflectDemo2 {
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		System.out.println("������Ҫִ�еĶ���:");
		String action = s.nextLine();
		UserSevice us = new UserSevice();
		/*if("login".equals(action)){
			us.login();
		}else if("update".equals(action)){
			us.update();
		}else if("delete".equals(action)){
			us.delete();
		}*/
		/*
		 * ��ȡ��action �ַ��������ݾ��Ƿ�������
		 * ���ǿ���ֱ��ͨ���������ƻ�ȡ��������
		 * Ȼ��ͨ�������ķ���ֱ�ӵ���
		 */
		try {
	        Class c = us.getClass();
	        Method method = c.getMethod(action, new Class[]{});
	        method.invoke(us, new Object[]{});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class UserSevice{
	public void login(){
		System.out.println("login...");
	}
	public void update(){
		System.out.println("update...");
	}
	public void delete(){
		System.out.println("delete...");
	}
}
