//lop ni de dinh dang ngay thang nam
public class Dates {
	private int day;
	private int month;
	private int year;
	
	public Dates(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public String toString() {
		return day+"/"+month+"/"+year;
	}
}
