package com.kh.run;

public class GenericTest2<T,E> {
	//������ Ÿ�� �ڷ��� ����
	private T data1;
	private E data2;
	public GenericTest2() {
	}
	public GenericTest2(T data1, E data2) {
		this.data1=data1;
		this.data2=data2;
	}
	public T geData1() {return data1;}
	public void setData1(T data1) {this.data1 =data1;}
	
	public E geData2() {return data2;}
	public void setData2(E data1) {this.data2 =data1;}
	//data�� int�� ���ߴµ� �׶��׶� ������ �Ǿ �ǵ���
}
