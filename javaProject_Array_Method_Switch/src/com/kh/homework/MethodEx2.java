package com.kh.homework;

import java.util.Scanner;

public class MethodEx2 {
	public void start() {
		Scanner sc = new Scanner(System.in);
		  char ch;
		  System.out.print("������ �Է� : ");
		  ch = sc.next().charAt(0);
		  System.out.println("===== �� ȯ =====");
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
	   /*������ �Է� : b
		===== �� ȯ =====
		b --> B*/
}
