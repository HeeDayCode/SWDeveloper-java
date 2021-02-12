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

		
		System.out.println("====로또 번호 생성기====");
		System.out.print("로또번호  생성개수:");
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