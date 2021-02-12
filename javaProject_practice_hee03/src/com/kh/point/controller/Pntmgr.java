package com.kh.point.controller;

import com.kh.point.vo.Grade;


public class Pntmgr {
	
	private Grade[] g = new Grade[30];	
	private int index = 0;

	public void insertData(Grade g) {
		this.g[index++] = g;
	}	
	public void printData() {
		System.out.println("=======회원정보출력=======");
		System.out.println("회원 \t\t 등급 \t\t 포인트 \t\t 이자포인트");
		for (int i = 0; i < index; i++) {
			System.out.println(this.g[i].getName() + "\t\t" + this.g[i].getGrade() + "\t\t" + this.g[i].getPoint()
					+ "\t\t" + this.g[i].getInterest());
		}		
	}
}
// 레퍼런스를 넣어주면 주소 넣음// 객체의 주소를 준다 == 레퍼런스
//Silver s= new Silver();
//public Pntmgr() {}