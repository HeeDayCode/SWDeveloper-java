package com.kh.point.controller;

import com.kh.point.vo.Grade;


public class Pntmgr {
	
	private Grade[] g = new Grade[30];	
	private int index = 0;

	public void insertData(Grade g) {
		this.g[index++] = g;
	}	
	public void printData() {
		System.out.println("=======ȸ���������=======");
		System.out.println("ȸ�� \t\t ��� \t\t ����Ʈ \t\t ��������Ʈ");
		for (int i = 0; i < index; i++) {
			System.out.println(this.g[i].getName() + "\t\t" + this.g[i].getGrade() + "\t\t" + this.g[i].getPoint()
					+ "\t\t" + this.g[i].getInterest());
		}		
	}
}
// ���۷����� �־��ָ� �ּ� ����// ��ü�� �ּҸ� �ش� == ���۷���
//Silver s= new Silver();
//public Pntmgr() {}