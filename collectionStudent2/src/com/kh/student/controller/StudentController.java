package com.kh.student.controller;

import java.util.ArrayList;

import com.kh.student.model.vo.Student;

public class StudentController {
	private ArrayList<Student> list = new ArrayList<Student>(); //DBó�� ���
	
	
	public ArrayList<Student> selectAll() {				
		return list;		
	} 				// �л� ��ü ��ȸ �޼ҵ�
	
	public Student selectOne(int classNumber)  {	
		for(int i = 0; i<list.size();i++) {		
			if(classNumber == list.get(i).getClassNumber())
			{
				return list.get(i);			
			}	
		}
		return null;		
	}				// �л� �Ѹ� ��ȸ �޼ҵ�
	public Boolean insertStudent(Student s)  {
		boolean result = list.add(s); //�����Ǹ� true boolean Ÿ��
		return result;
	} //f3������ �Ѿ�Գ�	
	//�л� �Է� �޼ҵ�

	public Boolean updateStudent(int classNumber, Student newStudent) {
		
		return false;
	}	// �л� ���� ���� �޼ҵ�
	public Boolean deleteStudent(int classNumber)  	{
		
		return false;
	}			// �л� ���� ���� �޼ҵ�

	
	
}
