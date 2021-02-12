package com.kh.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {
	
	public static void main(String[] args) {// 1970년 1월 1일 09시 기준점 시간
		 Date today =new Date(); //long형을 넣을 수 있음 디폴트(현재시간) 이거나 / (기준점으로 부터)밀리초를 넣거나
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		 String str = sdf.format(today);
		 System.out.println(str);
	}
}
