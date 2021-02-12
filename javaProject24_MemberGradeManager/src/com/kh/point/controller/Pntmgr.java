package com.kh.point.controller;

import java.util.Scanner;

import com.kh.point.vo.Gold;
import com.kh.point.vo.Grade;
import com.kh.point.vo.Silver;
import com.kh.point.vo.Vip;

public class Pntmgr implements PointMgr {
	private Scanner sc = new Scanner(System.in);
	private Grade[] g = new Grade[30];
	private int index = 0;

	public void start() {
		int select; // �ش� �޼ҵ忡���� ���� ������ ���� �� �ʿ�� ���� //���ù�ȣ
		while (true) {
			System.out.println("====== ȸ�� ����Ʈ ���� ���α׷� ======");
			System.out.println("1. ȸ�� ���� �Է�");
			System.out.println("2. ȸ�� ���� ���");
			System.out.println("3. ȸ�� ���� �˻�");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ����");
			System.out.println("6. ȸ�� ���� ��ü ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("����:");
			select = sc.nextInt();
			switch (select) {
			case 1:
				memberInsertData();
				break;
			case 2:
				memberAllPrintData();
				break;
			case 3:
				if (index == 0) {
					System.out.println("ȸ�� ������ �����ϴ�.");
				} else {

					/*
					 * System.out.println("========= ȸ�� ���� ��� =========");
					 * System.out.println("ȸ�� \t\t ��� \t\t ����Ʈ \t\t ��������Ʈ");
					 * System.out.println(searchMember(name).getName() + "\t\t" +
					 * searchMember(name).getGrade() + "\t\t" + searchMember(name).getPoint() +
					 * "\t\t" + searchMember(name).getInterest()); System.out.println();
					 */
				}
				break;
			case 4:
				memberModifyData();
				break;
			case 5:
				memberDeleteData();
				break;
			case 6:
				memberAllDeleteData();
				break;
			case 0:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				return;
			}
		}

	}

	@Override
	public void memberInsertData() {
		if (index >= g.length) {
			System.out.println("���� ������ ��á���ϴ�.");
			System.out.println();
		} else {
			System.out.println("========= ȸ�� ���� �Է� =========");
			System.out.print("ȸ�� �̸� �Է�:");
			String name = sc.next();
			System.out.print("ȸ�� ��� �Է�:");
			String grade = sc.next();
			System.out.print("ȸ�� ����Ʈ �Է�:");
			int point = sc.nextInt();

			// ������ ������ �κ��� switch ���� �Ἥ ������ �ϵ��� �����ִ� �ɷ� �Է� �ϴ� �Ű� �� ��ƴ�
			if (grade.equals("Silver")) {
				g[index++] = new Silver(name, grade, point);
			} else if (grade.equals("Gold")) {
				g[index++] = new Gold(name, grade, point);
			} else if (grade.equals("Vip")) {
				g[index++] = new Vip(name, grade, point);
			}
			System.out.println("ȸ�� ���� �Է��� �Ϸ�Ǿ����ϴ�.");
			System.out.println();
		}
	}

	@Override
	public void memberModifyData() {
		if (index == 0) {
			System.out.println("ȸ�� ������ �����ϴ�.");
			System.out.println();
		} else {
			System.out.println("ȸ�� ���� ������");
			System.out.print("���� ȸ�� �̸� �Է�:");
			String search_name = sc.next();
			for (int i = 0; i < index; i++) {
				if (search_name.equals(this.g[i].getName())) {
					System.out.println("========= ȸ�� ���� �Է� =========");
					System.out.print("ȸ�� �̸� �Է�:");
					this.g[i].setName(sc.next());
					System.out.print("ȸ�� ��� �Է�:");
					this.g[i].setGrade(sc.next());
					//��ް� ���õ� ������ �ִ� ��� �ٽ� �־��ֱ�
					System.out.print("ȸ�� ����Ʈ �Է�:");
					this.g[i].setPoint(sc.nextInt());
					System.out.println("ȸ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
					System.out.println();
				}
			}
		}
	}

	@Override
	public void memberAllPrintData() {
		if (index == 0) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		} else {
			System.out.println("========= ��ü ȸ�� ���� =========");
			System.out.println("ȸ�� \t\t ��� \t\t ����Ʈ \t\t ��������Ʈ");
			for (int i = 0; i < index; i++) {
				System.out.println(this.g[i].getName() + "\t\t" + this.g[i].getGrade() + "\t\t" + this.g[i].getPoint()
						+ "\t\t" + this.g[i].getInterest());
			}
			System.out.println();
		}
	}

	@Override
	public void memberDeleteData() {
		int k = 0;
		if (index == 0) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		} else {
			System.out.println("======== ȸ�� ���� ȭ�� ========");
			Grade tmpGrade = searchMember();
			System.out.println("�˻��� ȸ������: " + tmpGrade.getName());
			System.out.println("���� �����Ͻðڽ��ϱ�? (y/n)");
			char choice = sc.next().charAt(0);
			if (choice == 'y') {
				for (int i = 0; i < index; i++) {
					if (tmpGrade.equals(g[i])) {
						int j = i;
						while (g[j] != null) {
							// index �����
							if (j + 1 == index) {
								g[j] = null;
								index--; //������ �̼����� �������� ��� �̴ϱ� ���⼭ index�� �ٷ��ش�
								break;
							}
							g[j] = g[j + 1];
							j++;
						}
					}
				}
			}else {
				System.out.println("������ ����մϴ�.");
			}

			/*
			 * for (int i = 0; i < index; i++) { if
			 * (search_name.equals(this.g[i].getName())) {
			 * 
			 * this.g[i] = null; index--; k = i; while (g[k + 1] == null) { g[k] = g[k + 1];
			 * // null�� �ּҰ��� �� ���� �����ϱ� �����ֱ� } } }
			 */
		}

		System.out.println("ȸ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
		System.out.println();
	}

	@Override
	public Grade searchMember() {
		System.out.print("ȸ�� �̸� �Է�:");
		String search_name = sc.next();
		int searchIndex = 0;
		// Grade new_g = null;
		for (int i = 0; i < index; i++) {
			if (g[i].getName().equals(search_name)) {
				searchIndex = i;
				// new_g = g[i];
				break;
			}
		}
		//return new_g;
		return g[searchIndex];
	}

	public void memberAllDeleteData() {
		if (index == 0) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		} else {
			for (int i = 0; i < g.length; i++) {
				g[i] = null;
			}
			index = 0;
			System.out.println("��� ȸ�� ������ ���� �Ǿ����ϴ�.");
			System.out.println();
		}
	}
}