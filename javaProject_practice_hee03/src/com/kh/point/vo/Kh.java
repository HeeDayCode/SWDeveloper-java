package com.kh.point.vo;

public class Kh extends Grade {
	public Kh(){}
	public Kh(String name, String grade, int point){
		super(name,grade,point);
	}
	@Override
	public double getInterest() {	
		return this.point*0.5;
	}
}
