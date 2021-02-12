package com.kh.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataSort {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> al = new ArrayList<Integer>();

	public void start() {
		while (true) {
			System.out.println("1.숫자 데이터 입력");
			System.out.println("2.숫자 데이터 출력");
			System.out.println("3.숫자 데이터 정렬");
			System.out.print("선택: ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				insert();
				break;
			case 2:
				print();
				break;
			case 3:
				sort();
				break;
			}
			System.out.println();
		}
	}

	public void insert() {
		System.out.println("========== 입력 화면 ==========");
		while (true) {
			System.out.print("정수 입력(아무문자(숫자제외) 입력시 종료) : ");
			try {
				al.add(sc.nextInt());
			} catch (InputMismatchException e) {
				sc.next();
				break;
			}		
		}
		System.out.println("입력이 완료되었습니다.");
		

	}

	public void print() {
		System.out.println("========== 출력 화면 ==========");
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}
		
	}

	public void sort() {
		Collections.sort(al);
		System.out.println("정렬이 완료되었습니다.");
		
	}
}
