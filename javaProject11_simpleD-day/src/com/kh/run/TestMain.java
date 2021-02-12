package com.kh.run;

import java.util.Calendar;

public class TestMain {

	public static void main(String[] args) {
	
		Calendar today = Calendar.getInstance();
		long present = today.getTimeInMillis()/1000;
		today.set(Calendar.DATE,20);
		long dday = today.getTimeInMillis()/1000;
		long date =present-dday;
		
		int result =(int)date/60/60/24;
		System.out.println("D-Day와 "+result+"일 차이 납니다.");


	}
	
}
