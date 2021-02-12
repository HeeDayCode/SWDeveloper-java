package com.kh.point.vo;

public class Platinum extends Grade {
	public Platinum(){}
	public Platinum(String name, String grade, int point){
		super(name,grade,point);
	}
	@Override
	public double getInterest() {		
		return this.point*0.2;
	}
}
