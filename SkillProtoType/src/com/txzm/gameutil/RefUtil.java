package com.txzm.gameutil;

public class RefUtil {
	private static long refId = 0;
	
	public static long getRefId(){
		//todo:�Ժ���϶��߳�ͬ������
		return ++refId;
	}

}
