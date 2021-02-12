package com.kh.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.student.controller.StudentController;
import com.kh.student.model.vo.Student;

public class StudentView {
	private Scanner sc = new Scanner(System.in);
	private StudentController sCon = new StudentController(); // controller�� ����
	

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
				System.out.print("�й� �Է�:");
				selectOne(sc.nextInt());
				break;
			case 3:
				insertStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				break;
			case 0:
				return;

			}
		}
	}

	public void selectAll() {
		ArrayList<Student> list =sCon.selectAll();
		System.out.println("�й� / �̸� / ���� / �ּ� / ����");
		/*for(int i = 0; i<list.size();i++) {		
		System.out.println(list.get(i).getClassNumber()+"/"+list.get(i).getName()+"/"+ 
				list.get(i).getAge()+"/"+list.get(i).getAddress()+"/"+list.get(i).getGrade()
				);			
		}*/
		for(Student i : list)
		{
			System.out.println(i.getClassNumber()+"/"+i.getName()+"/"+
					i.getAge()+"/"+i.getAddress()+"/"+i.getGrade()
					);	
		}	
	}

	public void selectOne(int classNumber) {
		Student i = sCon.selectOne(classNumber);
		/*System.out.println(sCon.selectOne(classNumber).getClassNumber()+"/"+sCon.selectOne(classNumber).getName()+"/"+
				sCon.selectOne(classNumber).getAge()+"/"+sCon.selectOne(classNumber).getAddress()+"/"+sCon.selectOne(classNumber).getGrade()
				);	*/
		System.out.println(i.getClassNumber()+"/"+i.getName()+"/"+
				i.getAge()+"/"+i.getAddress()+"/"+i.getGrade()
				);
	}

	public void insertStudent() {		
		//�л� ���� �Է� // �й� �̸� ���� �ּ� ����
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

		boolean result = sCon.insertStudent(vo); //�л������� DB(ControllerŬ������  ArrayList)�� �����ϱ� ���� �뵵
		if(result == true) {
			System.out.println("�л����� �Է��� �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("�л����� �Է��� �����Ͽ����ϴ�.");
			System.out.println("���������� ���н� �����ڿ��� �������ּ���.");
		}
	}

	public void updateStudent() {
		System.out.print("�й� �Է�:");
		Student i = sCon.selectOne(sc.nextInt());
		System.out.println("------------ ������ ����� -----------");	
		System.out.print("�л� �й� �Է�:");
		i.setClassNumber(sc.nextInt());
		System.out.print("�л� �̸� �Է�:");
		i.setName(sc.next());
		System.out.print("�л� ���� �Է�:");
		i.setAge(sc.nextInt());
		System.out.print("�л� �ּ� �Է�:");
		i.setAddress(sc.next());
		System.out.print("�л� ���� �Է�:");
		i.setGrade(sc.nextDouble());	
	}

	public void deleteStudent() {
		System.out.print("�й� �Է�:");
		Student i = sCon.selectOne(sc.nextInt());
		
		
		
	}
}
