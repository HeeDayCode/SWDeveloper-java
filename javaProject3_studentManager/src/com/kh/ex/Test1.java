package com.kh.ex;

public class Test1 {

	public void testMethod() {
		System.out.println("�ȳ��ϼ��� �׽�Ʈ �޼ҵ� �Դϴ�.");
	}
	public void testMethod(int data) {
		System.out.println("ȣ�� ���� "+data+"�Դϴ�.");
	}
	public void testMethod(int data1,int data2) {
		System.out.println("2���� ���� " +data1+"��"+data2+"�̸� ���� ���� "+(data1+data2)+"�Դϴ�.");
	}
	public void testMethod(int data1,int data2,int result) {
		if((data1+data2)==result) {
			System.out.println(data1+"�� "+data2+"�� ���� ���� "+result+"�� �½��ϴ�.");	
		}else {
		System.out.println(data1+"�� "+data2+"�� ���� ���� "+result+"�� �ƴմϴ�.");
		}
	}	
}
