package movie.version4;
public class MovieTest {
	public static void main(String[] args) {
		//����ӰƬ
		Movie m1 = new Movie("����������սʿ");
		m1.setPriceCode(Movie.R_MOVIE);
		
		Movie m2 = new Movie("ϲ����ͻ�̫��");
		m2.setPriceCode(Movie.CHILLDREN_MOVIE);
		
		Movie m3 = new Movie("ȫ��Ŀ��");
		m3.setPriceCode(Movie.NEW_MOVIE);
		
		//�û���Ϣ
		Customer c1 = new Customer("��Ӯ");
		//������Ϣ
		Rental r1 = new Rental(m1, 2);
		Rental r2 = new Rental(m2,3);
		Rental r3 = new Rental(m3,3);
		//���û��������
		c1.add(r1);
	    c1.add(r2);
	    c1.add(r3);
	    c1.add(r1);
	    c1.printMssage();
	}

}
