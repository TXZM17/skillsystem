package com.txzm.gameobj;

import com.txzm.gamescheduler.Scheduler;
import com.txzm.gamescheduler.TargetScheduler;

public class Hero implements SkillTarget {
	private int mp;
	private int hp;
	private String name;
	private TargetScheduler scheduler;
	
	public Hero(String name){
		this.name = name;
		this.mp = 100;
		this.hp = 100;
		scheduler = new TargetScheduler(this);
	}

	@Override
	public void changeMp(int delta) {
		mp = Math.max(0, mp+delta);
		System.out.println(String.format("%s的mp改变了：%d,mp:%d.",name,delta,mp));
	}

	@Override
	public void changeHp(int delta) {
		hp = Math.max(0, hp+delta);
		System.out.println(String.format("%s的hp改变了：%d,hp:%d.",name,delta,hp));
	}

	@Override
	public Scheduler getSkillScheduler() {
		return scheduler;
	}

}
