package com.kh.method;

public class MethodEx1 {
	public void start()
	{
		//sub �޼ҵ带 �����Ͻÿ�
		//sub �޼ҵ�� 2���� ���� �ٴ缭 �� ������� �������־�� ��.
		
		
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
