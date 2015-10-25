package com.txzm.gamescheduler;

import com.txzm.gameobj.SkillTarget;

public class TargetScheduler implements Scheduler {
	private SkillTarget target;
	
	public TargetScheduler(SkillTarget target){
		this.target = target;
	}

	@Override
	public void update(double dt) {
		// TODO Auto-generated method stub

	}

	@Override
	public long addTask(Task task, double dt, int count) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long runDelay(Task task, double delayTime) {
		// TODO Auto-generated method stub
		return 0;
	}

}
