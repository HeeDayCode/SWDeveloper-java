package com.kh.run;

import com.kh.point.controller.Pntmgr;
import com.kh.point.vo.Gold;
import com.kh.point.vo.Silver;
import com.kh.point.vo.Vip;
public class TestMain {

	public static void main(String[] args) {
		Pntmgr mgr = new Pntmgr();		
		mgr.insertData(new Silver("ȫ�浿","�ǹ�",1000));  //�ǹ� Ŭ����
		mgr.insertData(new Silver("�踻��","�ǹ�",2000));
		mgr.insertData(new Silver("�˶���","�ǹ�",3000));
		mgr.insertData(new Silver("����","�ǹ�",4000));
		mgr.insertData(new Gold("����","���",1000));
		mgr.insertData(new Vip("�����","Vip",1000));
		mgr.printData();
	}
}
