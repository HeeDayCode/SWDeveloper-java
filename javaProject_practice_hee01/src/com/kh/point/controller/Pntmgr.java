package com.kh.point.controller;

import com.kh.point.vo.Gold;
import com.kh.point.vo.Silver;
import com.kh.point.vo.Vip;

public class Pntmgr {	
	private Silver[] s = new Silver[10];
	private Gold[] g = new Gold[10];
	private Vip[] v = new Vip[10];
	private int s_index = 0;
	private int g_index = 0;
	private int v_index = 0;

	public void insertData(Silver s ) {
		this.s[s_index++] = s;
	}
	public void insertData(Gold g ) {
		this.g[g_index++] = g;
	}	
	public void insertData(Vip v ) {
		this.v[v_index++] = v;
	}	
	
	public void printData() {
		System.out.println("ȸ���������");
		System.out.println("ȸ�� \t\t ��� \t\t ����Ʈ \t\t ��������Ʈ");
		for (int i = 0; i < s_index; i++) {
			System.out.println(this.s[i].getName() + "\t\t" + this.s[i].getGrade() + "\t\t" + this.s[i].getPoint()
					+ "\t\t" + this.s[i].getInterest());
		}	
		for (int i = 0; i < g_index; i++) {
			System.out.println(this.g[i].getName() + "\t\t" + this.g[i].getGrade() + "\t\t" + this.g[i].getPoint()
					+ "\t\t" + this.g[i].getInterest());
		}	
		for (int i = 0; i < v_index; i++) {
			System.out.println(this.v[i].getName() + "\t\t" + this.v[i].getGrade() + "\t\t" + this.v[i].getPoint()
					+ "\t\t" + this.v[i].getInterest());
		}	
	}
}