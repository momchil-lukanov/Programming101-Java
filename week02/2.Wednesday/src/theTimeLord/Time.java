package theTimeLord;

public class Time {
	
	int date;
	int month;
	int year;
	int hour; 
	int min;
	int sec;

	public Time(int date, int month, int year, int hour, int min, int sec){
		this.date =date;
		this.month = month;
		this.year = year;
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	public String toString(){
		String result = "";
		result = hour + ":" + min + ":" + sec + " " + date + "." + month + "." + year;
		return result;
	}

}
