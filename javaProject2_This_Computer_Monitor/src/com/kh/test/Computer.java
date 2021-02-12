package com.kh.test;

import java.util.Scanner;

public class Computer {
	String productName; // 제품명
	String computerInfo; // 컴퓨터 사양
	int price; // 가격
	Monitor m = new Monitor(); // 모니터 클래스를 인스턴스화

	public void computerInfoSetting(String _productName, String _computerInfo, int _price) {
		productName = _productName;
		computerInfo = _computerInfo;
		price = _price;
	}

	public void start() // 컴퓨터 동작
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("========모니터 정보 입력========");
		System.out.print("[모니터]의 모델명: ");
		String modelName = sc.next();
		System.out.print("[모니터]의 제품명: ");
		String productName = sc.next();
		System.out.print("[모니터]의 가격: ");
		int price = sc.nextInt();
		System.out.print("[모니터]의 색상: ");
		String color = sc.next();
		m.monitorInfoSetting(modelName, productName, price, color); // 모니터 정보입력

		System.out.println();
		System.out.println(); // 줄개행
		System.out.println("========컴퓨터 정보 입력========");
		System.out.print("[컴퓨터]의 제품명: ");
		String comProductName = sc.next();
		System.out.print("[컴퓨터]의 사양: ");
		String comInfo = sc.next();
		System.out.print("[컴퓨터]의 가격: ");
		int comPrice = sc.nextInt();
		computerInfoSetting(comProductName, comInfo, comPrice);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		while (true) {
			System.out.println("========컴퓨터 기능========");
			System.out.println("1. 컴퓨터 사양보기");
			System.out.println("2. 모니터 사양보기");
			System.out.println("3. 모니터 전원 켜기");
			System.out.println("4. 모니터 전원 끄기");
			System.out.println("5. 모니터 출력");
			System.out.println("0. 종료하기");
			System.out.print("선택: ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				computerInfoPrint();
				break;
			case 2:
				m.monitorInfoPrint();
				break;
			case 3:
				m.monitorPowerOn();
				break;
			case 4:
				m.monitorPowerOff();
				break;
			case 5:
				printString();
				break;
			case 0:
				System.out.println("종료하겠습니다.");
				return;
			}
		}
	}

	public void printString() {
		System.out.print("모니터를 통해 출력할 문자열 입력: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		m.moniterPrint(str);
	}

	public void computerInfoPrint() {
		System.out.println("======== 컴퓨터 사양 정보 ========");
		System.out.println("제품명 \t 컴퓨터 사양 \t 가격");
		System.out.println(productName + "\t" + computerInfo + "\t" + price);
	}
}
