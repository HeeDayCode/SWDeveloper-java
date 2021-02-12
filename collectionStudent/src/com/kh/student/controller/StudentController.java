package com.kh.student.controller;

import java.util.ArrayList;

import com.kh.student.model.vo.Student;

public class StudentController {
	private ArrayList<Student> list = new ArrayList<Student>(); // DBó�� ���
	//private ArrayList list = new ArrayList(); �Ⱦ��� Object ��ü�� ���°� �ǰ� �ٿ� ĳ������ ����ϱⰡ ����ϱ�
	
	public ArrayList<Student> selectAll() {
		ArrayList<Student> copyList = new ArrayList<Student>(list); //���纻�� �����ν� ������ �������� �ʵ��� �����
		return copyList;
	}

	public Student selectOne(int classNumber) {
		//Student vo; ���������� �ʱ�ȭ ���� �ʰ� �׳� ���� ������ ���� �� ���� 
		//Student vo=null;�� ������ return vo;�� �ص� ������ ���� �ʴ´�.
		for (int i = 0; i < list.size(); i++) {
			if (classNumber == list.get(i).getClassNumber()) {
				return list.get(i);
			}
		}
		return null; //
	}

	public Boolean insertStudent(Student s) { //ó���� �� �Ǿ��ٸ� �� �� �ְ� ǥ���� ���ִ� �ڵ尡 ���� �ڵ� //����ڴ� view�� �� �������� ���� ����
		boolean result = list.add(s);
		return result;
	}

	public Boolean updateStudent(int classNumber, Student newStudent) {
		//boolean result=false;
		for (int i = 0; i < list.size(); i++) {
			if (classNumber == list.get(i).getClassNumber()) {
				list.set(i, newStudent);
				return true;
			}
		}
		return false;
	}

	public Boolean deleteStudent(int classNumber) {
		for (int i = 0; i < list.size(); i++) {
			if (classNumber == list.get(i).getClassNumber()) {
				list.remove(i); //break; �ڵ尡 �굹�� �ʵ��� ������ֱ�
				return true;
			}
		}
		return false;
	}
}
