
public class TestTime {

	public static void main(String[] args) {
		//test Constructor and toString()
		//
		Time t1 = new Time(1,2,3);
		System.out.println(t1);//call toString() method
		//
		Time t2 = new Time();
		System.out.println(t2);//
		
		//test Setters
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		System.out.println("/n"+t1);
		System.out.println("Hpur is:"+t1.setHour());
		System.out.println("Minute is:"+t1.setMinute());
		System.out.println("Second is:"+t1.setSecond());
		
		t1.setTime(58, 59, 23);
		System.out.println("/n"+t1);
		System.out.println(t1.nextSecond());
		t1.setSecond(t1.nextSecond().nextSecond().nextSecond());
	}

}
