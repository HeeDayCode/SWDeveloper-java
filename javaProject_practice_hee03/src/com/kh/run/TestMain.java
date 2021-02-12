package com.kh.run;

import com.kh.point.controller.Pntmgr;
import com.kh.point.vo.Gold;
import com.kh.point.vo.Grade;
import com.kh.point.vo.Kh;
import com.kh.point.vo.Platinum;
import com.kh.point.vo.Silver;
import com.kh.point.vo.Vip;
import com.kh.point.vo.Vvip;

public class TestMain {

	public static void main(String[] args) {
		Pntmgr mgr = new Pntmgr();		
		mgr.insertData(new Silver("È«±æµ¿","½Ç¹ö",1000));  
		mgr.insertData(new Silver("±è¸»¶Ë","½Ç¹ö",2000));
		mgr.insertData(new Silver("¶Ë¶ËÀÌ","½Ç¹ö",3000));
		mgr.insertData(new Silver("°í±æ¶Ë","½Ç¹ö",4000));
		mgr.insertData(new Gold("±è°ñµå","°ñµå",1000));
		mgr.insertData(new Vip("±èºêÀÌ","Vip",1000));
		mgr.insertData(new Vvip("±èÈ¸Àå","Vvip",1000));
		mgr.insertData(new Platinum("±èÅë·É","Pla",1000));
		mgr.insertData(new Kh("±èÄÉÀÌ","Kh",1000));
		mgr.printData();
	}
}
