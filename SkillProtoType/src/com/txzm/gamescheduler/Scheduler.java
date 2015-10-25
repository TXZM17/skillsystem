package com.txzm.gamescheduler;

public interface Scheduler {
	void update(double dt);
	//返回的都是Task的refId
	//return RefUtil.getRefId()
	long addTask(Task task,double dt,int count);
	long runDelay(Task task,double delayTime);
}
