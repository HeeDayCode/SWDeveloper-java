package com.kh.run;

import java.util.Scanner;

public class CalculatorImpl implements Calculator {
	int sum = 0;
	double sum2=0;

	@Override
	public String add(String su1, String su2) {
		sum = Integer.valueOf(su1) + Integer.parseInt(su2);
		return String.valueOf(sum);
	}

	@Override
	public String subtract(String su1, String su2) {
		sum = Integer.valueOf(su1) - Integer.parseInt(su2);
		return String.valueOf(sum);
	}

	@Override
	public String multiply(String su1, String su2) {
		sum = Integer.valueOf(su1) * Integer.parseInt(su2);
		return String.valueOf(sum);	
	}

	@Override
	public String divide(String su1, String su2) {
		
		sum2 = Integer.valueOf(su1)/Double.valueOf(su2);
		return String.valueOf(sum2);
	}

	@Override
	public void start() {
		Scanner sc = new Scanner(System.in);
		char yun;
		String su1, su2;
		String result = "";
		System.out.print("연산자 입력: ");
		yun = sc.next().charAt(0);
		System.out.print("첫번째 숫자 입력:");
		su1 = sc.next();
		System.out.print("두번째 숫자 입력:");
		su2 = sc.next();

		switch (yun) {
		case '+':
			result = add(su1, su2);
			break;
		case '-':
			result = subtract(su1, su2);
			break;
		case '*':
			result = multiply(su1, su2);
			break;
		case '/':
			result = divide(su1, su2);
			break;
		}
		System.out.println("================결과================");
		System.out.println(su1 + " " + yun + " " + su2 + " = " + result);
		
	}
}
