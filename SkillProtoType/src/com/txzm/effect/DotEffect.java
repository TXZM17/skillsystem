package com.txzm.effect;

import com.txzm.gamemgr.SchedulerMgr;
import com.txzm.gameobj.SkillTarget;
import com.txzm.gamescheduler.Scheduler;
import com.txzm.gamescheduler.Task;

public class DotEffect implements Effect,Task{
	private int damage;
	private int count;
	private double deltaTime;
	private SkillTarget target = null;
	
	public DotEffect(int damage,int count,double deltaTime){
		this.damage = damage;
		this.count = count;
		this.deltaTime = deltaTime;
	}

	@Override
	public void cast(SkillTarget target) {
		this.target = target;
		Scheduler scheduler = SchedulerMgr.getInstance().getScheduler(target);
		scheduler.addTask(this, deltaTime, count);
	}

	@Override
	public void execute() {
		this.target.changeMp(-this.damage);
	}

}
