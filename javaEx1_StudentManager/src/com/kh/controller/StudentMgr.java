package com.kh.controller;

import java.util.Scanner;

import com.kh.vo.Student;

public class StudentMgr {
	Student s; // �ڱ� ����� ����ִ� ������ �� this�� ���ִ� ���� �´� //���� ���� �޼ҵ忡�� ����� �Ǵ� ���� ������ ���� ���
	Scanner sc = new Scanner(System.in);

	public void start() { // �⺻ ���� �޼ҵ�
		int select; // �ش� �޼ҵ忡���� ���� ������ ���� �� �ʿ�� ���� //���ù�ȣ
		while (true) {
			System.out.println("�л����� ���α׷�");
			System.out.println("1.�л� ���� �Է�");
			System.out.println("2.�л� ���� ���");
			System.out.println("3.�л� ���� ����");
			System.out.println("4.�л� ���� ����");
			System.out.println("0.���α׷� ����");
			System.out.print("����:");
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
			case 4:
				studentUpdate();
				break;
			case 0:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				return;
			}
		}
	}

	public void studentInsert() {
		if (this.s == null) {
			this.s = new Student(); /// �̰�
			System.out.print("�̸�:");
			this.s.setName(sc.next());
			System.out.print("�й�:");
			this.s.setId(sc.next());
			System.out.print("����:");
			this.s.setAge(sc.nextInt());
			System.out.print("����ȣ:");
			this.s.setPhone(sc.next());
			System.out.print("����:");
			this.s.setGender(sc.next());
		} else {
			System.out.println("�̹� �л� ������ �ֽ��ϴ�.");
		}
	}

	public void studentPrint() {
		if (this.s == null) {
			System.out.println("����� �л� ������ �����ϴ�.");
		} else {
			System.out.println("�̸� \t �й� \t ���� \t ����ȣ \t ����");
			System.out.println(this.s.getName() + "\t" + this.s.getId() + "\t" + this.s.getAge() + "\t"
					+ this.s.getPhone() + "\t" + this.s.getGender());
		}
	}

	public void studentDelete() {
		if (this.s == null) {
			System.out.println("������ �л��� ������ �����ϴ�.");
		} else {
			this.s = null;
			System.out.println("�л������� �����Ǿ����ϴ�.");
		}
	}

	public void studentUpdate() {
		if (this.s == null) {
			System.out.println("������ �л� ������ �����ϴ�.");
		} else {
			System.out.println("�л� ���� ����");
			System.out.println("1.�̸� ����");
			System.out.println("2.�й� ����");
			System.out.println("3.���� ����");
			System.out.println("4.����ȣ ����");
			System.out.println("5.���� ����");
			System.out.println("0.���ư���");
			System.out.print("����: ");
			int select;
			select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.print("�̸�:");
				this.s.setName(sc.next());
				break;
			case 2:
				System.out.print("�й�:");
				this.s.setId(sc.next());
				break;
			case 3:
				System.out.print("����:");
				this.s.setAge(sc.nextInt());
				break;
			case 4:
				System.out.print("����ȣ:");
				this.s.setPhone(sc.next());
				break;
			case 5:
				System.out.print("����:");
				this.s.setGender(sc.next());
				break;
			case 0:
				System.out.println("�⺻�������� ���ƿԽ��ϴ�.");
				return;
			}
		}
	}

}
