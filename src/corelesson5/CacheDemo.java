package corelesson5;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CacheDemo {
	/*
	 * �޸����ݵ�ʱ��ֻ��һ���߳�
	 * �������ֻ�Ƕ�����  �����̶߳����Է���
	 * ��д���Ļ���
	 */
	private HashMap<String,String> hm = new HashMap<String,String>();
	private ReentrantReadWriteLock rrw = new ReentrantReadWriteLock();
    private String value = null;
    public String getData(String key){
    	/*value = hm.get(key);
    	  if(value==null){
    		  value = "hello";//������ͨ��������Դ��ȡ
    		  hm.put(key, value);
    	  }
    	  return value;*/
    	rrw.readLock().lock();
    	try{
    		value = hm.get(key);//��Ҷ�������
    		if(value==null){
    			//Ҫ����д����
    			rrw.readLock().unlock();
    			rrw.writeLock().lock();
    			try{
    				if(value==null){
    				value = "hello";
    				hm.put(key, value);
    				}
    			}finally{
    				rrw.writeLock().unlock();
    				rrw.readLock().lock();
    			}
    		}
    	}finally{
    		rrw.readLock().unlock();
    	}
    	return value;
    }
}
