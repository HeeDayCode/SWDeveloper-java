package com.kh.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {
	
	public static void main(String[] args) {// 1970�� 1�� 1�� 09�� ������ �ð�
		 Date today =new Date(); //long���� ���� �� ���� ����Ʈ(����ð�) �̰ų� / (���������� ����)�и��ʸ� �ְų�
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		 String str = sdf.format(today);
		 System.out.println(str);
	}
}
