package com.kh.method;

public class MethodEx1 {
	public void start()
	{
		//sub 메소드를 정의하시오
		//sub 메소드는 2개의 값을 바당서 뺀 결과값을 리턴해주어야 함.
		
		
		int data;
		data = sub(100,50);
		System.out.println(data);
	}
	
	public int sub(int num1, int num2) {
		
		int sub;
		sub = num1-num2;
		
		return sub;
	}
}
