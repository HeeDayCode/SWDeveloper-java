package com.kh.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.student.controller.StudentController;
import com.kh.student.model.vo.Student;

public class StudentView {
	private Scanner sc = new Scanner(System.in);
	private StudentController sCon = new StudentController(); // controller�� ����
	// StudentController Ŭ������ ���۷����� ���鼭 ���������ش� ����

	public void mainMenu() // �޴��� �����ֱ� ���� �޼ҵ�
	{
		while (true) {
			System.out.println("-----------�л����� ���α׷�----------");
			System.out.println("1. �л� ���� ��ü ���");
			System.out.println("2. �л� ���� ��ȸ(�й�)");
			System.out.println("3. �л� ���� �Է�");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("����: ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				selectAll();
				break;
			case 2:
				selectOne();
				break;
			case 3:
				insertStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				return;

			}
		}
	}

	public void selectAll() {
		ArrayList<Student> list = sCon.selectAll(); 
		if (list.size() == 0) {
			System.out.println("�л� ������ �����ϴ�.");
			//return;
			// ????return;
		} else {
			System.out.println("-------------�л� ��ü ���� ��� --------------");
			System.out.println("�й� \t �̸� \t ���� \t �ּ� \t\t ����");
			for (Student vo : list) {
				System.out.println(vo.getClassNumber() + "\t" + vo.getName() + "\t" + vo.getAge() + "\t"
						+ vo.getAddress() + "\t" + vo.getGrade());
				// System.out.println(vo); ���� ������ toString�� ����ؼ� �����ϰ�

			} // �ڵ����� ����Ʈ�� ������ �� ������ ������
		}
	}

	public void selectOne() {
		//
		System.out.print("��ȸ�� �л��� �й�:");
		int classNumber = sc.nextInt();

		if (sCon.selectOne(classNumber) == null) {
			System.out.println("ã�� �л��� �����ϴ�.");
			// try~catch�� ���� ��Ȳ������ �������Ѵ�.
		} else {
			Student i = sCon.selectOne(classNumber);
			System.out.println("�й� \t �̸� \t ���� \t �ּ� \t\t ����");
			System.out.println(i.getClassNumber() + "\t" + i.getName() + "\t" + i.getAge() + "\t" + i.getAddress()
					+ "\t" + i.getGrade());
			// System.out.println(i);
		}
	}

	public void insertStudent() { // ���۷��� �̸��� �˾Ƽ�
		Student vo = new Student();
		System.out.print("�л� �й� �Է�:");
		vo.setClassNumber(sc.nextInt());
		System.out.print("�л� �̸� �Է�:");
		vo.setName(sc.next());
		System.out.print("�л� ���� �Է�:");
		vo.setAge(sc.nextInt());
		System.out.print("�л� �ּ� �Է�:");
		vo.setAddress(sc.next());
		System.out.print("�л� ���� �Է�:");
		vo.setGrade(sc.nextDouble());

		// boolean result = ; // �л������� DB(ControllerŬ������ ArrayList)�� �����ϱ� ���� �뵵 //�̸���
		// ������ �ٸ� ���� �޼ҵ�// �Ķ���� �Ű�����
		if (sCon.insertStudent(vo) == true) {
			System.out.println("�л����� �Է��� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�л����� �Է��� �����Ͽ����ϴ�.");
			System.out.println("���������� ���н� �����ڿ��� �������ּ���.");
		}
	}

	public void updateStudent() {
		System.out.print("�й� �Է�:");
		int classNumber = sc.nextInt();
		Student vo = sCon.selectOne(classNumber);
		if (vo == null) {
			System.out.println("ã�� �л��� �����ϴ�.");
		} else {
			System.out.println("------------ ������ �л� ���� -----------");
			System.out.println(vo);
			// while (true) {

			System.out.println("------------ ������ ����� -----------");
			// System.out.println("1. �л� �й� ����");
			/*
			 * System.out.println("1. �л� �̸� ����"); System.out.println("2. �л� ���� ����");
			 * System.out.println("3. �л� �ּ� ����"); System.out.println("4. �л� ���� ����");
			 * System.out.println("0. ���ư���"); System.out.print("����:"); int select =
			 * sc.nextInt();
			 */

			Student newVo = new Student();
			newVo.setClassNumber(classNumber);
			System.out.print("�л� �̸� �Է�:");
			newVo.setName(sc.next());
			System.out.print("�л� ���� �Է�:");
			newVo.setAge(sc.nextInt());
			System.out.print("�л� �ּ� �Է�:");
			newVo.setAddress(sc.next());
			System.out.print("�л� ���� �Է�:");
			newVo.setGrade(sc.nextDouble());

			/*
			 * switch (select) {
			 * 
			 * case 1: System.out.print("�л� �̸� �Է�:"); newVo.setName(sc.next()); break; case
			 * 2: System.out.print("�л� ���� �Է�:"); newVo.setAge(sc.nextInt()); break; case 3:
			 * System.out.print("�л� �ּ� �Է�:"); newVo.setAddress(sc.next()); break; case 4:
			 * System.out.print("�л� ���� �Է�:"); newVo.setGrade(sc.nextDouble()); break; case
			 * 0: return; }
			 */

			//boolean result = sCon.updateStudent(classNumber, newVo); // �л������� DB(ControllerŬ������ ArrayList)�� �����ϱ� ���� �뵵
			if (sCon.updateStudent(classNumber, newVo) == true) {
				System.out.println("�л����� ������ �Ϸ�Ǿ����ϴ�.");
			} else {
				System.out.println("�л����� ������ �����Ͽ����ϴ�.");
				System.out.println("���������� ���н� �����ڿ��� �������ּ���.");
			}
		}
	}
	// }

	public void deleteStudent() {
		System.out.println("1.��ü����");
		System.out.println("2.�˻�����");
		
		
		System.out.print("�й� �Է�:");
		//boolean result = sCon.deleteStudent(sc.nextInt());
		if (sCon.deleteStudent(sc.nextInt()) == true) {
			System.out.println("�л����� ������ �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�л����� ������ �����Ͽ����ϴ�.");
			System.out.println("���������� ���н� �����ڿ��� �������ּ���.");
		}
	}
}
