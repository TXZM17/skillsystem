package com.txzm.gameutil;

public class RefUtil {
	private static long refId = 0;
	
	public static long getRefId(){
		//todo:以后加上多线程同步操作
		return ++refId;
	}

}
