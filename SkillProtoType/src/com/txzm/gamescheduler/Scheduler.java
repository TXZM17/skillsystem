package com.txzm.gamescheduler;

public interface Scheduler {
	void update(double dt);
	//���صĶ���Task��refId
	//return RefUtil.getRefId()
	long addTask(Task task,double dt,int count);
	long runDelay(Task task,double delayTime);
}
