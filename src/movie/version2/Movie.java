package movie.version2;
/*
 * ��Ӱ��
 */
public class Movie {
	private String name;
	public Movie(){}
	public Movie(String name){
		this.name = name;
	}
	public static final int NEW_MOVIE = 1;//�����µ�Ӱ
	public static final int CHILLDREN_MOVIE=2;//��ͯ��Ӱ
	public static final int R_MOVIE = 3;//��ͨ��Ӱ
	private int priceCode;//�����˽��������ֵ�Ӱ
	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
	public int getPriceCode() {
		return priceCode;
	}
	public String getName() {
		return name;
	}
}
