package com.kh.pratice;

import java.util.Scanner;

public class StudentMgr {
	int index = 0;
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
		if(index>this.s.length) {
			System.out.println("�л� ���� ������ ����á���ϴ�.");			
		}else {
			System.out.println("===========�л� ���� �Է�==========");		
			this.s[index] = new Student();
			System.out.print((index + 1) + "�� �л� �̸�:");
			this.s[index].setName(sc.next());
			System.out.print((index + 1) + "�� �л� �й�:");
			this.s[index].setId(sc.next());
			System.out.print((index + 1) + "�� �л� ����:");
			this.s[index].setAge(sc.nextInt());
			System.out.print((index + 1) + "�� �л� �ڵ��� ��ȣ:");
			this.s[index].setPhone(sc.next());
			System.out.print((index + 1) + "�� �л� ����:");
			this.s[index].setGender(sc.next());
			System.out.println((index + 1) + "�� �л� ���� �Է��� �Ϸ�Ǿ����ϴ�.");
			System.out.println();
			this.index++;
		}	
	}

	public void studentPrint() {
		if (this.s[0] == null || this.s[1] == null || this.s[2] == null) {
			System.out.println("����� �л� ������ �����ϴ�.");
		} else {
			System.out.println("===========�л� ���� ���=======");
			System.out.println("�̸� \t �й� \t ���� \t �ڵ��� ��ȣ \t ����");
			for (int i = 0; i < index; i++) {
				System.out.println(s[i].getName() + "\t" + s[i].getId() + "\t" + s[i].getAge() + "\t" + s[i].getPhone()
						+ "\t" + s[i].getGender());
			}
		}
	}

	public void studentDelete() { //index==0 ����
		if (this.s[0] == null || this.s[1] == null || this.s[2] == null) {
			System.out.println("������ �л� ������ �����ϴ�.");
		} else {
			this.s = null;
			System.out.println("�л� ������ ���� �Ǿ����ϴ�.");
			this.s = new Student[3];
		}
	}
}