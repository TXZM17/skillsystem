package com.txzm.gameobj;

import com.txzm.gamescheduler.Scheduler;

public interface SkillTarget {
	
	public void changeMp(int delta);
	public void changeHp(int delta);
	public Scheduler getSkillScheduler();
	
}
