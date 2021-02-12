package com.kh.run;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp, tmp2;
		System.out.print("입력: ");
		tmp= sc.next();
				
		System.out.print("입력: ");
		sc.nextLine(); //버퍼 비우기 새로 내용을 받는다
		tmp2= sc.nextLine();
		//tmp= sc.next();
		
		System.out.println("입력한 결과 출력: "+tmp);
		System.out.println("입력한 결과 출력: "+tmp2);

	}

}
