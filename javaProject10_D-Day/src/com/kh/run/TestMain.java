package com.kh.run;

import java.util.Calendar;
import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) {	
		Calendar today = Calendar.getInstance();
		Scanner sc =new Scanner(System.in);
		System.out.print("D-Day[�⵵]�Է� :");
		int p_year = sc.nextInt();
		System.out.print("D-Day[��]�Է� :");
		int p_month = sc.nextInt();
		System.out.print("D-Day[��]�Է� :");
		int p_date = sc.nextInt();
		
		System.out.println("���� ��¥ :" + today.get(Calendar.YEAR) + "�� " + (today.get(Calendar.MONTH) + 1) + "�� "
				+ today.get(Calendar.DATE) + "�� ");

		long present = today.getTimeInMillis()/1000;
		today.set(Calendar.YEAR,p_year);
		today.set(Calendar.MONTH,p_month-1);
		today.set(Calendar.DATE,p_date);
		
		
		System.out.println("D-Day��¥ :" + p_year + "�� " + p_month + "�� "
				+ p_date + "�� ");
		long dday = today.getTimeInMillis()/1000;
		long date =present-dday;
		if(date>=0) {
			int result =(int)date/60/60/24;
			System.out.println(result+"�� �������ϴ�.");
		}else {
			long date2=dday-present;
			int result =(int)date2/60/60/24;
			System.out.println(result+"�� ���ҽ��ϴ�.");		
		}	
	}
	
}
