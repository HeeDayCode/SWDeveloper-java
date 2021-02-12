package com.kh.run;

import java.util.Calendar;
import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) {	
		Calendar today = Calendar.getInstance();
		Scanner sc =new Scanner(System.in);
		System.out.print("D-Day[년도]입력 :");
		int p_year = sc.nextInt();
		System.out.print("D-Day[월]입력 :");
		int p_month = sc.nextInt();
		System.out.print("D-Day[일]입력 :");
		int p_date = sc.nextInt();
		
		System.out.println("오늘 날짜 :" + today.get(Calendar.YEAR) + "년 " + (today.get(Calendar.MONTH) + 1) + "월 "
				+ today.get(Calendar.DATE) + "일 ");

		long present = today.getTimeInMillis()/1000;
		today.set(Calendar.YEAR,p_year);
		today.set(Calendar.MONTH,p_month-1);
		today.set(Calendar.DATE,p_date);
		
		
		System.out.println("D-Day날짜 :" + p_year + "년 " + p_month + "월 "
				+ p_date + "일 ");
		long dday = today.getTimeInMillis()/1000;
		long date =present-dday;
		if(date>=0) {
			int result =(int)date/60/60/24;
			System.out.println(result+"일 지났습니다.");
		}else {
			long date2=dday-present;
			int result =(int)date2/60/60/24;
			System.out.println(result+"일 남았습니다.");		
		}	
	}
	
}
