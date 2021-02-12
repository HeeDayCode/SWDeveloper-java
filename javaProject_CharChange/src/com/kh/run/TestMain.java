package com.kh.run;

import java.util.StringTokenizer;

public class TestMain {

	public static void main(String[] args) {
		String str = "J a v a P r o g r a m";
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuffer sb = new StringBuffer();

		char[] ch = new char[st.countTokens()];

		for (int i = 0; i < ch.length; i++) {
			ch[i] = st.nextToken().charAt(0);
		}	
		for (int i = 0; i < ch.length; i++) {
			if ('a' <= ch[i] && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32); // ch[i] -= 32;
			}
			sb.append(ch[i]);
		}
		System.out.print(sb);
	}
}
