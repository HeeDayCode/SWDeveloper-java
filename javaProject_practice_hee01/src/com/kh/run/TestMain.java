package com.kh.run;

import com.kh.point.controller.Pntmgr;
import com.kh.point.vo.Gold;
import com.kh.point.vo.Silver;
import com.kh.point.vo.Vip;
public class TestMain {

	public static void main(String[] args) {
		Pntmgr mgr = new Pntmgr();		
		mgr.insertData(new Silver("È«±æµ¿","½Ç¹ö",1000));  //½Ç¹ö Å¬·¡½º
		mgr.insertData(new Silver("±è¸»¶Ë","½Ç¹ö",2000));
		mgr.insertData(new Silver("¶Ë¶ËÀÌ","½Ç¹ö",3000));
		mgr.insertData(new Silver("°í±æ¶Ë","½Ç¹ö",4000));
		mgr.insertData(new Gold("±è°ñµå","°ñµå",1000));
		mgr.insertData(new Vip("±èºêÀÌ","Vip",1000));
		mgr.printData();
	}
}
