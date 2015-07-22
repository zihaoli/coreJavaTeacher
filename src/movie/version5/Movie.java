package movie.version5;
/*
 * ��Ӱ��
 */
public class Movie {
	private String name;
	private Price price;
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
		switch (this.getPriceCode()) {
		case Movie.NEW_MOVIE:
			price = new NewMoviePrice();
			break;
		case Movie.CHILLDREN_MOVIE:
			price = new ChildrenMoviePrice();
			break;
		case Movie.R_MOVIE:
		   price = new RMoviePrice();
		}
		return price.getPrice(days);
	}
	/**
	 * ��ȡ����
	 * @param fre
	 * @param rental TODO
	 * @return
	 */
	public int getFre(int days) {
		return price.getFre(days);
	}
}
