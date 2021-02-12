package com.kh.run;

public class GenericTest1<D> {
	//데이터 타입 자료형 지정
	private D data;
	public GenericTest1(D data) {
		this.data=data;
	}
	//data를 int로 정했는데 그때그때 변경이 되어도 되도록
}
