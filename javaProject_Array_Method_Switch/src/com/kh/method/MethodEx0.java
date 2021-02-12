package com.kh.method;

import java.util.Scanner;

public class MethodEx0 {
	/* 다음 코드에서 소문자 한글자를 입력 받으면 대문자로 변경
	   대문자 한 글자를 입력받으면 소문자로 변경할 수 있도록 메소드를 만들어라.
	 */
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.print("영문자 입력 : ");
		ch = sc.next().charAt(0);
		System.out.println("===== 변 환 =====");
		System.out.print(ch+" --> ");
		ch = charChange(ch);
		System.out.println(ch);
	}
	
	public char charChange(char ch) {
		//입력한 데이커가 소문자인지 대문자인지 판별 
		
		if ('a'<=ch && ch<='z') //소문자라면?
		{
			ch=(char) (ch-32); //ch가 a라고 할 때 컴퓨터는 ch를 4바이트 97(숫자)로 인식 
							   //2바이트 char(문자) 로 전환하기 위해 (char)를 
		}else if ('A'<=ch && ch<='Z') //대문자라면?
		{
			ch=(char) (ch+32);
		}
		
		return ch;
	}
	
}
	
	
