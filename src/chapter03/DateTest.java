package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date now = new Date();
		// 윈도우의 현재시간
		System.out.println(now);

		printDate1(now);
		printDate2(now);
	}

	public static void printDate1(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 DD일 hh시 mm분 ss초");
		String s = sdf.format(d);
		System.out.println(s);

	}

	public static void printDate2(Date d) {
		// 년도(+1900)
		int year = d.getYear();

		// 월(0-11, +1)
		int month = d.getMonth();

		// 일
		int date = d.getDate();

		// 시
		int hours = d.getHours();

		// 분
		int minutes = d.getMinutes();
		// 초
		int seconds = d.getSeconds();

		System.out
				.println((year + 1900) + "-" + (month + 1) + "-" + date + "-" + hours + "-" + minutes + "-" + seconds);
	}
}
