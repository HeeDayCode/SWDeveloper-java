package com.kh.controller;

import java.util.Scanner;

import com.kh.vo.Student;

public class StudentMgr {
	private Student[] s = new Student[10];
	private Scanner sc = new Scanner(System.in);
	private int index = 0;

	public void start() {
		while (true) {
			System.out.println("===== �л� ���� �Ŵ��� ver1.0 =====");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ���� ���");
			System.out.println("3. �л� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("����: ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				studentInsert();
				break;
			case 2:
				studentPrint();
				break;
			case 3:
				studentDelete();
				break;
			case 0:
				System.out.println("���� �Ǿ����ϴ�.");
				return;
			}
		}
	}
	private void studentInsert() {
		if(index>=s.length) {
			System.out.println("���� ������ ��á���ϴ�.");
		}else {
		System.out.println("====== �л� ���� �Է� ======");
		System.out.print("�л� �̸� �Է�:");
		String name = sc.next();
		System.out.print("�л� ���� �Է�:");
		int age = sc.nextInt();
		System.out.print("�л� ���� �Է�:");
		String gender = sc.next();
		s[index++] = new Student(name, age, gender);
		System.out.println("�л� ���� �Է��� �Ϸ�Ǿ����ϴ�.");
		}
	}
	
	private void studentPrint() {
		if (index == 0) {
			System.out.println("����� �л� ������ �����ϴ�.");
		} else {
			System.out.println("�١١١١١١١� �л� ���� ��� �١١١١١١١�");
			System.out.println("�̸� \t\t ���� \t\t ����");
			for (int i = 0; i < index; i++) {
				System.out.println(s[i].getName() + "\t\t" + s[i].getAge() + "\t\t" + s[i].getGender());
			}
		}
	}
	private void studentDelete() {
		for (int i = 0; i < s.length; i++) {
			s[i] = null;
		}
		index = 0;
		System.out.println("��� �л� ������ ���� �Ǿ����ϴ�.");
	}
}
