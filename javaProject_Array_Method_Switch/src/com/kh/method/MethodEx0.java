package com.kh.method;

import java.util.Scanner;

public class MethodEx0 {
	/* ���� �ڵ忡�� �ҹ��� �ѱ��ڸ� �Է� ������ �빮�ڷ� ����
	   �빮�� �� ���ڸ� �Է¹����� �ҹ��ڷ� ������ �� �ֵ��� �޼ҵ带 ������.
	 */
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.print("������ �Է� : ");
		ch = sc.next().charAt(0);
		System.out.println("===== �� ȯ =====");
		System.out.print(ch+" --> ");
		ch = charChange(ch);
		System.out.println(ch);
	}
	
	public char charChange(char ch) {
		//�Է��� ����Ŀ�� �ҹ������� �빮������ �Ǻ� 
		
		if ('a'<=ch && ch<='z') //�ҹ��ڶ��?
		{
			ch=(char) (ch-32); //ch�� a��� �� �� ��ǻ�ʹ� ch�� 4����Ʈ 97(����)�� �ν� 
							   //2����Ʈ char(����) �� ��ȯ�ϱ� ���� (char)�� 
		}else if ('A'<=ch && ch<='Z') //�빮�ڶ��?
		{
			ch=(char) (ch+32);
		}
		
		return ch;
	}
	
}
	
	
