package com.kh.ex;

public class Test1 {

	public void testMethod() {
		System.out.println("안녕하세요 테스트 메소드 입니다.");
	}
	public void testMethod(int data) {
		System.out.println("호출 값은 "+data+"입니다.");
	}
	public void testMethod(int data1,int data2) {
		System.out.println("2개의 값은 " +data1+"와"+data2+"이며 합한 값은 "+(data1+data2)+"입니다.");
	}
	public void testMethod(int data1,int data2,int result) {
		if((data1+data2)==result) {
			System.out.println(data1+"과 "+data2+"의 합한 값은 "+result+"이 맞습니다.");	
		}else {
		System.out.println(data1+"과 "+data2+"의 합한 값은 "+result+"이 아닙니다.");
		}
	}	
}
