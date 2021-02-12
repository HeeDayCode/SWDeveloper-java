package com.kh.run;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//기본형으로 래퍼클래스 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		/*int data = sc.nextInt();
		String s= String.valueOf(data);		
		System.out.println(s);*/
		
		String data2 =sc.next();
		int i =Integer.parseInt(data2);
		System.out.println(data2);
		
	}

}
