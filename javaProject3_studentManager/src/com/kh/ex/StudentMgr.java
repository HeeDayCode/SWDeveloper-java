package com.kh.ex;

import java.util.Scanner;

public class StudentMgr {
	Student[] s = new Student[3];
	Scanner sc = new Scanner(System.in);

	public void start() 
	{
		while (true) {
			int select;
			System.out.println("======== �л� ���� ���α׷� ver 1.0 ========");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ���� ���");
			System.out.println("3. �л� ���� ����");
			System.out.println("0. �л� ���� ���α׷� ����");
			System.out.print("����: ");
			select = sc.nextInt();

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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}

	public void studentInsert() {
		System.out.println("===========�л� ���� �Է�==========");
		for (int i = 0; i < this.s.length; i++) {
			this.s[i] = new Student();
			System.out.print((i + 1) + "�� �л� �̸�:");
			this.s[i].setName(sc.next());
			System.out.print((i + 1) + "�� �л� �й�:");
			this.s[i].setId(sc.next());
			System.out.print((i + 1) + "�� �л� ����:");
			this.s[i].setAge(sc.nextInt());
			System.out.print((i + 1) + "�� �л� �ڵ��� ��ȣ:");
			this.s[i].setPhone(sc.next());
			System.out.print((i + 1) + "�� �л� ����:");
			this.s[i].setGender(sc.next());
			System.out.println();
		}
		System.out.println("�л� ���� �Է��� �Ϸ�Ǿ����ϴ�.");
	}

	public void studentPrint() {
		if (this.s[0] == null || this.s[1] == null || this.s[2] == null) {
			System.out.println("����� �л� ������ �����ϴ�.");
		} else {
			System.out.println("===========�л� ���� ���=======");
			System.out.println("�̸� \t �й� \t ���� \t �ڵ��� ��ȣ \t ����");
			for (int i = 0; i < this.s.length; i++) {
				System.out.println(s[i].getName() + "\t" + s[i].getId() + "\t" + s[i].getAge() + "\t" + s[i].getPhone()
						+ "\t" + s[i].getGender());
			}
		}
	}

	public void studentDelete() {
		if (this.s[0] == null || this.s[1] == null || this.s[2] == null) {
			System.out.println("������ �л� ������ �����ϴ�.");
		} else {
			this.s = null;
			System.out.println("�л� ������ ���� �Ǿ����ϴ�.");
			this.s = new Student[3];
		}
	}
}