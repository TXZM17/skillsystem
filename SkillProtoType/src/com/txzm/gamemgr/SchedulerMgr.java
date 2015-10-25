package com.txzm.gamemgr;

import com.txzm.gameobj.SkillTarget;
import com.txzm.gamescheduler.Scheduler;

public class SchedulerMgr {
	private SchedulerMgr(){
		
	}
	
	public static SchedulerMgr getInstance(){
		return new SchedulerMgr();
	}
	
	public Scheduler getScheduler(SkillTarget target){
		return target.getSkillScheduler();
	}

}
