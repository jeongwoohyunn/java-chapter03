package chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		printDate(cal);
		
		cal.add(Calendar.DATE, -70);
		printDate(cal);
		//calendar은 set을 할 수 있다. 
		cal.set(Calendar.YEAR,2020);
		//month(12)-1
		printDate(cal);
		
		//한번에도 가능
		cal.set(2007,11,18);
		printDate(cal);
		
		//1000 더해진 날이 나온다.
		cal.add(Calendar.DATE, 1000);
		printDate(cal);
		
	
	}
	public static void printDate(Calendar cal) {
		String[] days = {"일","월","화","수","목","금","토"};
		
		//년도
		int year = cal.get(Calendar.YEAR);
		
		//월(0~11, +1)
		int month = cal.get(Calendar.MONTH);
		
		//일
		int date = cal.get(Calendar.DATE);
		
		//요일 1(일)  - 7(토)
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		//시
		int hours = cal.get(Calendar.HOUR);
		
		//분
		int minute = cal.get(Calendar.MINUTE);
		
		//초
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(
			year + "년" + 
			(month+1) + "월" +
			date+ "일 " +
			days[day-1] + "요일 "+
			hours+ "시" +
			minute+ "분" +
			second+ "초"
				);
	}

}
