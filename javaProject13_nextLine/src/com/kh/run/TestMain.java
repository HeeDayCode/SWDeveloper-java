package com.kh.run;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp, tmp2;
		System.out.print("�Է�: ");
		tmp= sc.next();
				
		System.out.print("�Է�: ");
		sc.nextLine(); //���� ���� ���� ������ �޴´�
		tmp2= sc.nextLine();
		//tmp= sc.next();
		
		System.out.println("�Է��� ��� ���: "+tmp);
		System.out.println("�Է��� ��� ���: "+tmp2);

	}

}
