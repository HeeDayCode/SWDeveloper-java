package com.kh.homework;

import java.util.Scanner;

public class MethodEx2 {
	public void start() {
		Scanner sc = new Scanner(System.in);
		  char ch;
		  System.out.print("영문자 입력 : ");
		  ch = sc.next().charAt(0);
		  System.out.println("===== 변 환 =====");
		  System.out.print(ch + " --> ");
		  ch = charChange(ch);
		  System.out.println(ch);		
	}
	public char charChange(char ch) {
		if ('a'<=ch && ch<='z') 
		{
			ch=(char) (ch-32); 							   
		}else if ('A'<=ch && ch<='Z') 
		{
			ch=(char) (ch+32);
		}		
		return ch;	
	}
	   /*영문자 입력 : b
		===== 변 환 =====
		b --> B*/
}
