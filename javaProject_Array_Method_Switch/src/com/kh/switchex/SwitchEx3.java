package com.kh.switchex;

import java.util.Scanner;

public class SwitchEx3 {
	public void start() {
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.print("일수를 알고 싶은 달을 입력하시오:");
		month=sc.nextInt();
		
		if(1<=month && month<=12)
		{
		switch(month) 
		{
		case 2:System.out.println("2월달은 28일까지 있습니다.");
				break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"월달은 30일까지 있습니다.");
			break;
		
		default: System.out.println(month+"월달은 31일까지 있습니다.");
		}			
		}
		else 
		{
			System.out.println("잘못된 달을 입력하셨습니다.");
		}
	}
}
