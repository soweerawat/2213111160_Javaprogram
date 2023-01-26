
public class Time {
	private int second;
	private int minute;
	private int hour;
	
	public Time(int i, int j, int k) {
		this.second = 0;
		this.minute = 0;
		this. hour = 0;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setHour() {
		this.minute = minute;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public String toString() {
		//Use function String.format()
		return String.format("%02d:%02d:%02d",hour,minute,second );
	}
	//set second,minute and hour to the given values
	public void setTime(int second,int minute,int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	//Advances this Time instance by one second
	public Time nextSecond() {
		++second;
		if(second>=60) {
			second = 0;
			++minute;
			if(minute>=60) {
				minute = 0;
				++hour;
				if(hour>=24) {
					hour = 0;
				}
			}
		}
		//Return"this" instance,to support chaining operations
		//
		return this;
	}

}
