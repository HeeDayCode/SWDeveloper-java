package com.kh.switchex;

import java.util.Scanner;

public class SwitchEx3 {
	public void start() {
		Scanner sc = new Scanner(System.in);
		int month;
		
		System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ�:");
		month=sc.nextInt();
		
		if(1<=month && month<=12)
		{
		switch(month) 
		{
		case 2:System.out.println("2������ 28�ϱ��� �ֽ��ϴ�.");
				break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month+"������ 30�ϱ��� �ֽ��ϴ�.");
			break;
		
		default: System.out.println(month+"������ 31�ϱ��� �ֽ��ϴ�.");
		}			
		}
		else 
		{
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
		}
	}
}
