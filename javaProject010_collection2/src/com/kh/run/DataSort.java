package com.kh.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataSort {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> al = new ArrayList<Integer>();

	public void start() {
		while (true) {
			System.out.println("1.���� ������ �Է�");
			System.out.println("2.���� ������ ���");
			System.out.println("3.���� ������ ����");
			System.out.print("����: ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				insert();
				break;
			case 2:
				print();
				break;
			case 3:
				sort();
				break;
			}
			System.out.println();
		}
	}

	public void insert() {
		System.out.println("========== �Է� ȭ�� ==========");
		while (true) {
			System.out.print("���� �Է�(�ƹ�����(��������) �Է½� ����) : ");
			try {
				al.add(sc.nextInt());
			} catch (InputMismatchException e) {
				sc.next();
				break;
			}		
		}
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
		

	}

	public void print() {
		System.out.println("========== ��� ȭ�� ==========");
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}
		
	}

	public void sort() {
		Collections.sort(al);
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		
	}
}
