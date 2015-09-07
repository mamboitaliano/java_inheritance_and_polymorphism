package labGraded;
import java.util.GregorianCalendar;

public class MyDate {

	public static void main(String[] args) {
		MyDate firstDate = new MyDate();
		MyDate secondDate = new MyDate(34355555133101L);
		MyDate thirdDate = new MyDate(4, 10, 2014);	
		
		System.out.println(firstDate.year + " " + firstDate.month + " " + firstDate.day);
		System.out.println(secondDate.year + " " + secondDate.month + " " + secondDate.day);
		System.out.println(thirdDate.year + " "  + thirdDate.month + " " + thirdDate.day);
	}
	
	GregorianCalendar currentDate = new GregorianCalendar();
	
	// The data fields year, month and day that represent a date, month is 0-based, i.e., 0 is for January
	int year = 0;
	int month = 0;
	int day = 0;
	
	// 'firstDate': A no-arg constructor that creates a MyDate object for the current date
	MyDate() {
		year = currentDate.get(GregorianCalendar.YEAR);
		month = currentDate.get(GregorianCalendar.MONTH);
		day = currentDate.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	// 'secondDate': A constructor that constructs a MyDate object with the specified elapsed time since midnight, January 1, 1970.
	MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}
	
	// 'thirdDate': A constructor that constructs a MyDate object with the specified year, month, and day, respectively
	MyDate(int specifiedMonth, int specifiedDay, int specifiedYear) {
		year = specifiedYear;
		month = specifiedMonth;
		day = specifiedDay;
	}
	
	// get method for data field year
	int getYear() {
		return year;
	}
	
	// get method for data field month
	int getMonth() {
		return month;
	}
	
	// get method for data field day
	int getDay() {
		return day;
	}
		
	void setDate(long elapsedTime) {
		 currentDate.setTimeInMillis(elapsedTime);
		 year = currentDate.get(GregorianCalendar.YEAR);
		 month = currentDate.get(GregorianCalendar.MONTH);
		 day = currentDate.get(GregorianCalendar.DAY_OF_MONTH);
	}
}
