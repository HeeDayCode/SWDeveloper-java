package com.kh.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LottoController {
	public void start() {
		Scanner sc = new Scanner(System.in);
		HashSet hs = new HashSet();
		Random ran = new Random();

		
		System.out.println("====�ζ� ��ȣ ������====");
		System.out.print("�ζǹ�ȣ  ��������:");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			for(int j = 0; hs.size() < 6; j++) {
				hs.add(ran.nextInt(45) + 1);
			}	
			ArrayList list = new ArrayList(hs);
			Collections.sort(list);
			System.out.println(list);
			
			list.clear();
			hs.clear();
		}
	}
}