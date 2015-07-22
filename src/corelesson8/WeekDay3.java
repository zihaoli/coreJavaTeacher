package corelesson8;
public enum WeekDay3 {
	MON{
		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return TUE;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "����һ";
		}
	},TUE{
		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return WED;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "���ڶ�";
		}
	},
	WED(){
		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return THU;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "������";
		}
	},
	THU(){
		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return FRI;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "������";
		}
	},
	FRI(5){

		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return SAT;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "������";
		}
		
	},
	SAT(6){

		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return SUN;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "������";
		}
		
	},
	SUN(7){

		@Override
		public WeekDay3 nextDay() {
			// TODO Auto-generated method stub
			return MON;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "������";
		}
		
	};
	private WeekDay3(){}
	private WeekDay3(int n){}
	public abstract WeekDay3 nextDay();

}