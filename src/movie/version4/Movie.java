package movie.version4;
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
	/**
	 * �����Ǯ
	 * @param result
	 * @param rental TODO
	 * @return
	 */
	public double getPrice(int days) {
		double result = 0;
		switch (this.getPriceCode()) {
		case Movie.NEW_MOVIE:
			result = days * 3;
			break;
		case Movie.CHILLDREN_MOVIE:
			if (days <= 3)
				result = 1.5;
			else
				result = (days- 3) * 1.5 + 1.5;
			break;
		case Movie.R_MOVIE:
			if (days <= 3)
				result = 2;
			else
				result = (days - 3) * 2 + 1.5;
		}
		return result;
	}
	/**
	 * ��ȡ����
	 * @param fre
	 * @param rental TODO
	 * @return
	 */
	public int getFre(int days) {
		if (this.getPriceCode() == Movie.NEW_MOVIE
				&& days > 1)
			return 2;
		return 1;
	}
}
