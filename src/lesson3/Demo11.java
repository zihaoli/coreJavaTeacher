package lesson3;

public class Demo11 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outerMethod1();
		System.out.println("=======================");
		/*���������Ա�ڲ������Ȩ����Ĭ�ϵģ���ô��ͬһ���¾Ϳ���
		 * ֱ�ӷ���,�����������ֱ�Ӵ����ڲ���Ķ���
		*/
		Outer.Inner inner = outer.new Inner("lisi",40);
		System.out.println(inner);
		inner.innermethod1();
		System.out.println("=======================");
		inner.innermethod2();
	}
}
class Outer{
	String xxx;
	private int i;
	public void setI(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
	public void outerMethod1(){
		//��Ա��������������һ����Ա��ֻ���������Ա������һ����
		Inner inner = new Inner("zhangsan"	, 30);
		System.out.println(inner);
		inner.innermethod1();
		
	}
	public void outerMethod2(){
		System.out.println("outerMethod2������ʹ��");
	}
	/*������Ĭ�ϵ�Ȩ�ޡ�����Ϊpublic�ȣ������ĵ�λ�͵ȼ���һ��
	 * ���һ����ͨ��Ա
	*/
   class Inner{
	     private String name;
	     private int age; 
	     public Inner(String name,int age){
	    	 this.name = name;
	    	 this.age = age;
	     }
	     public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	    
		@Override
		public String toString() {
			return "Inner [name=" + name + ", age=" + age + "]";
		}
		public void innermethod1(){
	    	 System.out.println("innerMethod1...");
	    }
		public void innermethod2(){
			System.out.println("�����ⲿ��ĳ�Ա����");
			/*�ڳ�Ա�ڲ�ֱ�ӷ����ⲿ��ĳ�Ա
		    �ȼ�һ����Ա����������һ����Ա
		    һ���Ǿ�̬�ĳ�Ա���ʷǾ�̬�ĳ�Ա��ǰ��ʡ����this
		    ��ô�ڷǾ�̬��Ա�ڲ����У������ⲿ��������Ǿ�̬��Ա
		    �Ƿ�Ҳʡ����this
		    ���ֱ����this����Ϊ���ڲ���ĵ�ǰ����
		    ���ָ�����ⲿ��ĵ�ǰ�����أ��ⲿ�������.this
		    */
			//outerMethod2(); ����
			/*Outer.this����ʡ�Դ����ⲿ��ĵ�ǰ����
			 * ����������һЩӦ���п��ܲ���ʡ��
			 */
			Outer.this.outerMethod2();
		}
	}
}
