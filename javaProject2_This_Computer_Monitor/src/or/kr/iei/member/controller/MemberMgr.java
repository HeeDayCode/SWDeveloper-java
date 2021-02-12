package or.kr.iei.member.controller;

import java.util.Scanner;

import or.kr.iei.member.vo.Member;

public class MemberMgr {
	Member m;
	Scanner sc = new Scanner(System.in);

	public void start() {
		if (m != null) {
			System.out.println("�̹� ȸ�� ������ �ֽ��ϴ�.");
		} else {
			while (true) {
				System.out.println("======ȸ�� ���� ���α׷�======");
				System.out.println("1. ȸ������");
				System.out.println("2. ȸ���������");
				System.out.println("3. ȸ����������");
				System.out.println("4. ȸ������");
				int select;
				System.out.print("����: ");
				select = sc.nextInt();

				switch (select) {
				case 1:
					memberInsert();
					break;
				case 2:
					memberPrint();
					break;
				case 3:
					memberUpdate();
					break;
				case 4:
					memberDelete();
					break;

				}
			}
		}
	}

	public void memberInsert() {

		if (m != null) {
			System.out.println("�̹� ȸ�������� �ֽ��ϴ�.");
		} else {
			m = new Member();
			System.out.println("======ȸ�� ���� ======");
			System.out.print("�̸�:");
			m.setName(sc.next());
			System.out.print("����:");
			m.setAge(sc.nextInt());
			System.out.print("�ּ�:");
			m.setAddress(sc.next());
			System.out.print("�ڵ��� ��ȣ:");
			m.setPhone(sc.next());
			System.out.print("����:");
			m.setGender(sc.next());
		}
	}

	public void memberPrint() {
		if (m == null) {
			System.out.println("ȸ�������� �����ϴ�.");
		} else {
			System.out.println("�̸� \t ���� \t �ּ� \t �ڵ��� ��ȣ \t ����");
			System.out.println(m.getName() + "\t" + m.getAge() + "\t" + m.getAddress() + "\t" + m.getPhone() + "\t"
					+ m.getGender());
		}
	}

	public void memberUpdate() {
		// m = new Member();
		if (m == null) {
			System.out.println("��ϵ� ȸ�� ������ �����ϴ�.");
		} else {
			System.out.println("======ȸ�� ����======");
			System.out.println("1. �̸� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. �ּ� ����");
			System.out.println("4. �ڵ��� ��ȣ ����");
			System.out.println("5. ���� ����");
			System.out.print("������ �κ� ����:");
			int select;
			select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.print("�̸�:");
				m.setName(sc.next());
				break;
			case 2:
				System.out.print("����:");
				m.setAge(sc.nextInt());
				break;
			case 3:
				System.out.print("�ּ�:");
				m.setAddress(sc.next());
				break;
			case 4:
				System.out.print("�ڵ��� ��ȣ:");
				m.setPhone(sc.next());
				break;
			case 5:
				System.out.print("����:");
				m.setGender(sc.next());
				break;
			}

		}
	}

	public void memberDelete() {
		m = null;
		System.out.println("ȸ�� ������ �Ϸ� �Ǿ����ϴ�.");
	}
}
