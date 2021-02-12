package com.kh.point.vo;

public class Vvip extends Grade{	
	public Vvip(){}
	public Vvip(String name, String grade, int point){
		super(name,grade,point);
	}
	@Override
	public double getInterest() {		
		return this.point*0.1;
	}
}
