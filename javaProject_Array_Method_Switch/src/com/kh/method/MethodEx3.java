package com.kh.method;

import java.util.Scanner;

public class MethodEx3 {

		public void start()
		{
			//�ҹ����� ����:97~122
			//�빮���� ����:65~90 
			//�ҹ��� a:97 / �빮�� A: 65  / 32���̰� ����!
			//�ҹ��� b:98 / �빮�� B: 90  / 32���̰� ����!
			//�ҹ��� z:122/ �빮�� Z: 90  / 32 ���̰� ����!
			
			Scanner sc = new Scanner(System.in);
			char ch;
			System.out.print("���� �ѱ���(�ҹ���) �Է� : ");
			ch = sc.next().charAt(0);
			
			System.out.println("�Է��� ���� : "+ ch);			
			System.out.printf("�Է��� ���� ��ȯ : %c \n",(ch-32));
		}
}
