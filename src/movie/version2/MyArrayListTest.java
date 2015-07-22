package movie.version2;
public class MyArrayListTest {
	public static void main(String[] args) {
		Movie m1 = new Movie("����������սʿ");
		m1.setPriceCode(Movie.R_MOVIE);
		
		Movie m2 = new Movie("ϲ����ͻ�̫��");
		m2.setPriceCode(Movie.CHILLDREN_MOVIE);
		
		Movie m3 = new Movie("ȫ��Ŀ��");
		m3.setPriceCode(Movie.NEW_MOVIE);
		Rental r1 = new Rental(m1, 2);
		Rental r2 = new Rental(m2,3);
		Rental r3 = new Rental(m3,3);
		
		MyArrayList list1 = new MyArrayList();
		list1.add(r1);
		list1.add(r2);
		list1.add(r3);
		
	    Rental rental = (Rental)list1.get(0);
	  //  System.out.println(rental.getDays());
	  //  System.out.println(rental.getMovie().getName());
	    System.out.println(rental.toString());
	    
	    System.out.println(list1.getDataIndex(r2));
	    System.out.println(list1.contains(r1)+"...");
	    
	    //���Լ��κζ����
	    MyArrayList list2 = new MyArrayList();
	    list2.add(m1);
	    list2.add(m2);
	    list2.add(m3);
	    System.out.println(list2.contains(m2));
	    System.out.println(list2.getIndex());
	    System.out.println("=========================");
	    
	    //���Ա���list1
	    Iterator itor = list1.iterator();
	    while(!itor.isDone()){
	    	Rental rr = (Rental)itor.getCurrent();
	    	System.out.println(rr);
	    	itor.next();
	    }
	    
	    System.out.println("==================");
	    Iterator itor2 = list2.iterator();
	    while(!itor2.isDone()){
	    	Movie movie = (Movie)itor2.getCurrent();
	    	System.out.println(movie.getName());
	    	itor2.next();
	    }
	}

}
