package com.kh.switchex;

import java.util.Scanner;

public class SwitchEx {
	public void start()
	{
		Scanner sc=new Scanner(System.in);
		int select;
		System.out.println("1~3���� ���� �Է�: ");
		select = sc.nextInt();
		switch(select) {
		case 1: System.out.println("1�� �Է��Ͽ����ϴ�.");
		break;
		case 2: System.out.println("2�� �Է��Ͽ����ϴ�.");
		break;
		case 3: System.out.println("3�� �Է��Ͽ����ϴ�.");
		break;
		default : System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
		}
		
	}
}
