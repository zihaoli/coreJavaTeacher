package corelesson3;

import java.util.HashMap;

public class HashMapDemo3 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		hm.put("x", 10);
		hm.put("y", 20);
		/*key��ͬ �Ḳ��֮ǰ��value key��β�����ͬkey
		 * ע��equals������hashCode������ʵ��
		*/
		hm.put("x", 30);
		System.out.println(hm);
		System.out.println("========================");
		//����ÿ���ַ����ֵĴ���
		String s = "abcdefghijkabchdieukkscsserdaaxayh";
		/*
		 * ˼·���õ�ÿ���ַ�����Ϊkey����HashMap�����
		 * ���map�в����� ��ôput(key,1)
		 * ����Ѿ�����  ��ôput(key,value+1);
		 */
		HashMap<String, Integer> hm1 = new HashMap<String,Integer>();
		for(int i = 0; i < s.length();i++){
			String str = s.substring(i,i+1);
			if(hm1.containsKey(str)){
				hm1.put(str, hm1.get(str)+1);
			}else{
				hm1.put(str, 1);
			}
		}
		System.out.println(hm1);
		
	}

}
