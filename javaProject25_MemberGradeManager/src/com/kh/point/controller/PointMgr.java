package com.kh.point.controller;

import com.kh.point.vo.Grade;

public interface PointMgr {
	public void memberInsertData();
	public void memberModifyData();
	public void memberAllPrintData();
	public void memberDeleteData();
	public int searchMember();
}

