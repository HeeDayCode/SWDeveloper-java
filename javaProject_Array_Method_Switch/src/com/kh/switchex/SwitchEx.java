package com.kh.switchex;

import java.util.Scanner;

public class SwitchEx {
	public void start()
	{
		Scanner sc=new Scanner(System.in);
		int select;
		System.out.println("1~3까지 숫자 입력: ");
		select = sc.nextInt();
		switch(select) {
		case 1: System.out.println("1을 입력하였습니다.");
		break;
		case 2: System.out.println("2를 입력하였습니다.");
		break;
		case 3: System.out.println("3을 입력하였습니다.");
		break;
		default : System.out.println("잘못된 값을 입력하셨습니다.");
		}
		
	}
}
