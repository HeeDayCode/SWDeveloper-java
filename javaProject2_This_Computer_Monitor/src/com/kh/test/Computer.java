package com.kh.test;

import java.util.Scanner;

public class Computer {
	String productName; // ��ǰ��
	String computerInfo; // ��ǻ�� ���
	int price; // ����
	Monitor m = new Monitor(); // ����� Ŭ������ �ν��Ͻ�ȭ

	public void computerInfoSetting(String _productName, String _computerInfo, int _price) {
		productName = _productName;
		computerInfo = _computerInfo;
		price = _price;
	}

	public void start() // ��ǻ�� ����
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("========����� ���� �Է�========");
		System.out.print("[�����]�� �𵨸�: ");
		String modelName = sc.next();
		System.out.print("[�����]�� ��ǰ��: ");
		String productName = sc.next();
		System.out.print("[�����]�� ����: ");
		int price = sc.nextInt();
		System.out.print("[�����]�� ����: ");
		String color = sc.next();
		m.monitorInfoSetting(modelName, productName, price, color); // ����� �����Է�

		System.out.println();
		System.out.println(); // �ٰ���
		System.out.println("========��ǻ�� ���� �Է�========");
		System.out.print("[��ǻ��]�� ��ǰ��: ");
		String comProductName = sc.next();
		System.out.print("[��ǻ��]�� ���: ");
		String comInfo = sc.next();
		System.out.print("[��ǻ��]�� ����: ");
		int comPrice = sc.nextInt();
		computerInfoSetting(comProductName, comInfo, comPrice);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		while (true) {
			System.out.println("========��ǻ�� ���========");
			System.out.println("1. ��ǻ�� ��纸��");
			System.out.println("2. ����� ��纸��");
			System.out.println("3. ����� ���� �ѱ�");
			System.out.println("4. ����� ���� ����");
			System.out.println("5. ����� ���");
			System.out.println("0. �����ϱ�");
			System.out.print("����: ");
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
				System.out.println("�����ϰڽ��ϴ�.");
				return;
			}
		}
	}

	public void printString() {
		System.out.print("����͸� ���� ����� ���ڿ� �Է�: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		m.moniterPrint(str);
	}

	public void computerInfoPrint() {
		System.out.println("======== ��ǻ�� ��� ���� ========");
		System.out.println("��ǰ�� \t ��ǻ�� ��� \t ����");
		System.out.println(productName + "\t" + computerInfo + "\t" + price);
	}
}
