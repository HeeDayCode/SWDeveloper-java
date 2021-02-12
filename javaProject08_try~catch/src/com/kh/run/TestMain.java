package com.kh.run;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("======= 계산기 프로그램 =======");
			try {
				System.out.print("연산자 입력(1.더하기,2.나누기) :");
				int yun =sc.nextInt();
				System.out.print("첫번째 수 입력:");
				int num1 = sc.nextInt();
				System.out.print("두번째 수 입력:");
				int num2 = sc.nextInt();
				
				int result =0;
				switch(yun) {
				case 1:result =num1+num2; break;
				case 2:result =num1/num2; break;				
				}
				//result = num1 / num2; // 안에 쓰면 지역변수 //예외가 발생 가능한 코드를 딱 넣어주기
				System.out.println("결과: " + result);

			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다.");
				//System.out.println("에러코드: " + e.getMessage());
				// e.getMessage는 개발자가 확인을 하기 위해서 사용
				sc.next(); //버퍼의 데이터를 꺼내와서 반복이 멈추도록
				//sc = new Scanner(System.in);
				
				//예외 처리는 상황에 맞는 경우에만 쓰는 것이 좋다 예외를 구분하기
			} catch(ArithmeticException e) {			
				System.out.println("0으로 나눌수가 없습니다.");
				//각각의 예외를 구분해주어야 끝까지 프로그램이 돌아갈 수 있음 
			}
			System.out.println("이용해주셔서 감사합니다.");
		}
	}
}

