package com.kh.switchex;

import java.util.Scanner;

//char형 처리 


public class SwitchEx4 {
	public void start() 
	{
		Scanner sc =new Scanner(System.in);
		char op;
		int num1, num2;
		
		System.out.println("=== 계산기 프로그램 ===");
		System.out.print("연산자 입력 (+,-,*,/) :");
			op=sc.next().charAt(0);
		
		System.out.print("첫 번째 숫자 입력 :");
			num1=sc.nextInt();
		System.out.print("두 번째 숫자 입력 :");
			num2=sc.nextInt();
		
		System.out.println("====== 결과 ======");
		
		System.out.printf("%d %c %d =",num1,op,num2);
		switch(op) 
		{
		case '+':System.out.print(num1+num2);
		break;
		case '-':System.out.print(num1-num2);
		break;
		case '*':System.out.print(num1*num2);
		break;
		case '/':System.out.print(num1/(double)num2);
		break;
		default: System.out.print("잘못 입력하셨습니다.");
		}
		
	}
}
