package com.kh.run;

public class GenericTest2<T,E> {
	//데이터 타입 자료형 지정
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
	//data를 int로 정했는데 그때그때 변경이 되어도 되도록
}
