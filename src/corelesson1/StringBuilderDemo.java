package corelesson1;

public class StringBuilderDemo {
	public static void main(String[] args) {
		System.out.println(getString(4));
	}
	/**
	 * �õ�����(?,?,?)
	 * @param length   ?�ĸ���
	 * @return
	 */
	public static String getString(int length){
		StringBuilder s = new StringBuilder();
		s.append("(");
		for(int i = 0; i < length;i++){
			s = i==0 ? s.append("?") : s.append(",?");
		}
		s.append(")");
		return s.toString();
	}
}
