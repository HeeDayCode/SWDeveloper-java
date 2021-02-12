package com.kh.switchex;

import java.util.Scanner;

public class SwitchEx2 {

	public void start() {
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.print("일수를 알고 싶은 달을 입력하시오:");
		month=sc.nextInt();
		
		switch(month) {
		case 1: System.out.println(month+"월달은 31일 수 입니다.");
		break;
		case 2: System.out.println(month+"월달은 28일 수 입니다.");
		break;
		case 3: System.out.println(month+"월달은 31일 수 입니다.");
		break;
		case 4: System.out.println(month+"월달은 30일 수 입니다.");
		break;
		case 5: System.out.println(month+"월달은 31일 수 입니다.");
		break;
		case 6: System.out.println(month+"월달은 30일 수 입니다.");
		break;
		case 7: System.out.println(month+"월달은 31일 수 입니다.");
		break;
		case 8: System.out.println(month+"월달은 31일 수 입니다.");
		break;
		case 9: System.out.println(month+"월달은 30일 수 입니다.");
		break;
		case 10: System.out.println(month+"월달은 31일 수 입니다.");
		break;
		case 11: System.out.println(month+"월달은 30일 수 입니다.");
		break;
		case 12: System.out.println(month+"월달은 31일 수 입니다.");
		break;
		
		default: System.out.println("잘못 입력하셨습니다.");
		
		}
	}
}
