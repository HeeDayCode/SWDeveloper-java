package com.kh.controller;

import java.util.Scanner;

import com.kh.vo.Student;

public class StudentMgr { // f3 controller class�� ����
	Student s; //���۷����� ����� ��ü�� ����������
	Scanner sc = new Scanner(System.in);

	public void start() // Ŭ���� ���� �޼ҵ�
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
				stdentPrint();
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

	public void studentInsert() // �ٽ������Է� �޼ҵ�
	{
		if (s != null) {
			System.out.println("�̹� �л� ������ �ֽ��ϴ�.");
		} else {
			s = new Student(); //��ü�� ���۷����� �̾��ش�
			System.out.println("===========�л� ���� �Է�==========");
			System.out.print("�л� �̸�:");
			s.setName(sc.next());
			System.out.print("�л� �й�:");
			s.setId(sc.next());
			System.out.print("�л� ����:");
			s.setAge(sc.nextInt());
			System.out.print("�л� �ڵ��� ��ȣ:");
			s.setPhone(sc.next());
			System.out.print("�л� ����:");
			s.setGender(sc.next());

			System.out.println("�л� ���� �Է��� �������ϴ�.");
		}
	}

	public void stdentPrint() // �л� ���� ���
	{
		if (s == null) {
			System.out.println("�л��� ������ �����ϴ�.");
		} else {
			System.out.println("===========�л� ���� ���=======");
			System.out.println("�̸� \t �й� \t ���� \t �ڵ��� ��ȣ  \t ����");
			System.out.println(
					s.getName() + "\t" + s.getId() + "\t" + s.getAge() + "\t" + s.getPhone() + "\t" + s.getGender());
		}

	}

	public void studentDelete() // �л����� ���� �޼ҵ�
	{
		s = null;
		System.out.println("�л� ������ ���� �Ǿ����ϴ�.");
	}

}
