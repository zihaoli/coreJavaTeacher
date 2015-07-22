package corelesson8;

public class WeekDay {
	public static final WeekDay MON = new WeekDay();
	public static final WeekDay TUE = new WeekDay();
	public static final WeekDay WED = new WeekDay();
	public static final WeekDay THU  = new WeekDay();
	public static final WeekDay FRI  = new WeekDay();
	public static final WeekDay SAT = new WeekDay();
	public static final WeekDay SUN = new WeekDay();
	private WeekDay(){}
	public WeekDay nextDay(){
		if(this.equals(MON))
			return TUE;
		else if(this.equals(TUE))
			return WED;
		else if(this.equals(WED))
			return THU;
		else if(this.equals(THU))
			return FRI;
		else if(this.equals(FRI))
			return SAT;
		else if(this.equals(SAT))
			return SUN;
		else 
			return MON;
	}
	public String toString(){
		if(this.equals(MON))
			return "����һ";
		else if(this.equals(TUE))
			return "���ڶ�";
		else if(this.equals(WED))
			return "������";
		else if(this.equals(THU))
			return "������";
		else if(this.equals(FRI))
			return "������";
		else if(this.equals(SAT))
			return "������";
		else 
			return "������";
	}
}
