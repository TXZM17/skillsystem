package com.txzm.skill;

import com.txzm.gamemgr.SchedulerMgr;
import com.txzm.gameobj.SkillTarget;
import com.txzm.gamescheduler.Scheduler;
import com.txzm.gamescheduler.Task;

public abstract class TriggeredEffect implements Effect,Task {
	private double duration;
	private SkillTarget target;
	double getDuration(){
		return duration;
	}
	public abstract void install();
	public abstract void uninstall();
	public void cast(SkillTarget target){
		this.target = target;
		install();
		Scheduler scheduler = SchedulerMgr.getInstance().getScheduler(this.target);
		scheduler.runDelay(this, getDuration());
	}
	public void execute(){
		uninstall();
	}
}
