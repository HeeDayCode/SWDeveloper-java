package com.kh.run;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("======= ���� ���α׷� =======");
			try {
				System.out.print("������ �Է�(1.���ϱ�,2.������) :");
				int yun =sc.nextInt();
				System.out.print("ù��° �� �Է�:");
				int num1 = sc.nextInt();
				System.out.print("�ι�° �� �Է�:");
				int num2 = sc.nextInt();
				
				int result =0;
				switch(yun) {
				case 1:result =num1+num2; break;
				case 2:result =num1/num2; break;				
				}
				//result = num1 / num2; // �ȿ� ���� �������� //���ܰ� �߻� ������ �ڵ带 �� �־��ֱ�
				System.out.println("���: " + result);

			} catch (InputMismatchException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				//System.out.println("�����ڵ�: " + e.getMessage());
				// e.getMessage�� �����ڰ� Ȯ���� �ϱ� ���ؼ� ���
				sc.next(); //������ �����͸� �����ͼ� �ݺ��� ���ߵ���
				//sc = new Scanner(System.in);
				
				//���� ó���� ��Ȳ�� �´� ��쿡�� ���� ���� ���� ���ܸ� �����ϱ�
			} catch(ArithmeticException e) {			
				System.out.println("0���� �������� �����ϴ�.");
				//������ ���ܸ� �������־�� ������ ���α׷��� ���ư� �� ���� 
			}
			System.out.println("�̿����ּż� �����մϴ�.");
		}
	}
}

