package corelesson3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
	public static void main(String[] args) {
		User2 u1 = new User2("0001", "zhangsan", 20, "1234");
		User2 u2 = new User2("0002","lisi",21,"12345");
		User2 u3 = new User2("0003","wangwu",20,"123456");
		HashMap hm = new HashMap();
		hm.put(u1.getId(),u1);
		hm.put(u2.getId(), u2);
		hm.put(u3.getId(),u3);
		//��ֵ�Եĸ���
		System.out.println(hm.size());
		//ֱ�Ӵ�ӡMap������ӡkey��toString=value��toString
		System.out.println(hm);
		//key value����Object     get(key)�õ�value
		User2 user = (User2)hm.get("0001");
		System.out.println(user);
		//�Ƿ����ĳ��key
		System.out.println(hm.containsKey("0002"));
		/*������ʽ1����Map�����е�key��������Set������
		 * Ȼ�����Set���ϣ��õ�key,ͨ��key��ȡvalue
		 */
		Set set = hm.keySet();
		for(Object object : set){
			String key = (String)object;
			User2 u = (User2)hm.get(key);
			System.out.println(key+"="+u);
		}
		System.out.println("================");
		/*
		 * ������ʽ2
		 *  ����HashMap�����е�key,value��ʵ���ᱻ��װ��
		 *  Map.Entry����ڲ��������  
		 *  ��һ����ֵ�Ծʹ���һ��Map.Entry��ʵ������
		 *  ͨ��entrySet()�����Ϳ��԰���Щʵ�����󶼷���Set������
		 *  ����Set��ȡÿ������
		 */
		Set set1 = hm.entrySet();
		for(Object object:set1){
			Map.Entry me = (Map.Entry)object;
			System.out.println(me.getKey()+"="+me.getValue());
		}
	}

}
