package com.kh.switchex;

import java.util.Scanner;

//char�� ó�� 


public class SwitchEx4 {
	public void start() 
	{
		Scanner sc =new Scanner(System.in);
		char op;
		int num1, num2;
		
		System.out.println("=== ���� ���α׷� ===");
		System.out.print("������ �Է� (+,-,*,/) :");
			op=sc.next().charAt(0);
		
		System.out.print("ù ��° ���� �Է� :");
			num1=sc.nextInt();
		System.out.print("�� ��° ���� �Է� :");
			num2=sc.nextInt();
		
		System.out.println("====== ��� ======");
		
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
		default: System.out.print("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
}
