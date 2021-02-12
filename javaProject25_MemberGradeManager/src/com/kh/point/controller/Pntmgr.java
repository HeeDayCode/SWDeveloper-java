package com.kh.point.controller;

import java.util.Scanner;

import com.kh.point.vo.Gold;
import com.kh.point.vo.Grade;
import com.kh.point.vo.Silver;
import com.kh.point.vo.Vip;

public class Pntmgr implements PointMgr {
	private Scanner sc = new Scanner(System.in);
	private Grade[] g = new Grade[2];
	private int index = 0;

	public void start() // �⺻ ������ ���۽�Ű�� �޼ҵ�
	{
		while (true) {
			System.out.println("====== ����Ʈ ȸ�� ���� �ý��� ver 1.0 ======");
			System.out.println("1. ȸ������ �Է�");
			System.out.println("2. ȸ������ ���");
			System.out.println("3. ȸ������ ����");
			System.out.println("4. ȸ������ ����");
			System.out.println("0. ���α׷� ���� ");
			System.out.print("���� : ");
			int select = sc.nextInt();
			if (select == 0) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}

			switch (select) {
			case 1:
				memberInsertData();
				break;// ȸ������ �Է�
			case 2:
				memberAllPrintData();
				break;// ȸ������ ���
			case 3:
				memberModifyData();
				break;// ȸ������ ����
			case 4:
				memberDeleteData();
				break;// ȸ������ ����
			}
		}
	}

	@Override
	public void memberInsertData() {
		System.out.print("����� ȸ�� �̸� : ");
		String name = sc.next();
		System.out.print("����� ȸ�� ���(1.Silver/2.Gold/3.Vip) : ");
		int grade = sc.nextInt();

		System.out.print("����� ȸ�� �ʱ� ����Ʈ : ");
		int point = sc.nextInt();

		switch (grade) {
		case 1:
			g[index++] = new Silver(name, "Silver", point);
			break;
		case 2:
			g[index++] = new Gold(name, "Gold", point);
			break;
		case 3:
			g[index++] = new Vip(name, "Vip", point);
			break;
		}

		System.out.println("ȸ�� ���� �Է� �Ϸ� !!!");

	}

	@Override
	public void memberModifyData() {
		System.out.println("========= ȸ�� ���� ���� ==========");
		int searchIndex = searchMember();
		System.out.println("ȸ������ : " + g[searchIndex].getName() + "/" + g[searchIndex].getGrade() + "/"
				+ g[searchIndex].getPoint());

		System.out.println("1. �̸� ����");
		System.out.println("2. ��� ����");
		System.out.println("3. ���� ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("������ �̸� �Է� : ");
			g[searchIndex].setName(sc.next());
			break;
		case 2:
			System.out.print("������ ��� �Է�(1.Silver/2.Gold/3.Vip) : ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				g[searchIndex] = new Silver(g[searchIndex].getName(), "Silver", g[searchIndex].getPoint());
				break;

			case 2:
				g[searchIndex] = new Gold(g[searchIndex].getName(), "Gold", g[searchIndex].getPoint());
				break;

			case 3:
				g[searchIndex] = new Vip(g[searchIndex].getName(), "Vip", g[searchIndex].getPoint());
				break;
			}
			break;
		case 3:
			System.out.print("������ ���� �Է� : ");
			g[searchIndex].setPoint(sc.nextInt());
			break;

		}

	}

	@Override
	public void memberAllPrintData() {
		System.out.println("========= ��ü ȸ�� ���� ==========");
		System.out.println("�̸� \t\t ��� \t\t ����Ʈ \t\t ��������Ʈ ");
		for (int i = 0; i < index; i++) {
			System.out.println(g[i].getName() + " \t\t " + g[i].getGrade() + " \t\t " + g[i].getPoint() + "\t\t "
					+ g[i].getInterest());
		}

	}

	@Override
	public void memberDeleteData() {
		System.out.println("========= ���� ȭ�� =========");
		int searchIndex = searchMember();
		if (searchIndex == -1) {
			System.out.println("ã�� ȸ���� �����ϴ�.");
		} else {
			/*index�� g.length�� 1���� �����ϰ�
			searchIndex�� 0���� �����ϱ� ������ ��ȣ�� ���ų� 1�� ����� ��
			index�� ����ִ� ������ ���� ī��Ʈ���ְ� 
			g.length */ 
			while (searchIndex < index) {
				if (searchIndex == (g.length - 1))break;
				
				g[searchIndex] = g[searchIndex + 1];
				searchIndex++;
			}
			g[searchIndex] = null;
			index--;

		}
	}

	@Override
	public int searchMember() {
		System.out.print("ȸ�� �̸� �Է� : ");
		String name = sc.next();
		for (int i = 0; i < index; i++) {
			if (g[i].getName().equals(name)) {
				
				return i; // i���� ã�� ��ü�� �ε��� ��ȣ
			}
		}
		return -1;
	}

}
