package corelesson3;

import java.util.HashMap;
import java.util.TreeSet;

public class HashMapDemo4 {
	public static void main(String[] args) {
		/*�������ַ������м����������ֵĴ���
		 * ���ʱҪ���մ��������������������ͬ
		 * ������ĸ��������
		 * 
		 * ˼·��ͨ��HashMap���ϾͿ���ʵ�ּ�������Ĳ���
		 * ���Ҫ�����������ǿ��Բ���TreeSet����
		 * �����Ǹ��ݷ���TreeSet�еĶ�������Խ��������
		 * ���ǿ��Գ�ȡ��һ��������������
		*/
		String s = "abcdefghijkabchdieukkscsserdaaxayh";
		HashMap<String, Integer> hm1 = new HashMap<String,Integer>();
		for(int i = 0; i < s.length();i++){
			String str = s.substring(i,i+1);
			if(hm1.containsKey(str)){
				hm1.put(str, hm1.get(str)+1);
			}else{
				hm1.put(str, 1);
			}
		}
		//System.out.println(hm1);
		/*
		 * ����HashMap���ϣ�Ȼ���ÿһ��key/value����װ
		 * ��T�����ʵ������TreeSet���ϣ������������
		 */
		TreeSet<T> ts = new TreeSet<T>();
		for(String key : hm1.keySet()){
			T t = new T(key,hm1.get(key));
			ts.add(t);
		}
		System.out.println(ts);
	}
}
class T implements Comparable<T>{
	private String name;
	private int count;
	public T(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return name+"���ֵĴ�����:"+count;
	}
	@Override
	public int compareTo(T o) {
		if(this.count!=o.count)
			return o.count-this.count;
		return this.name.compareTo(o.name);
	}
	
}
