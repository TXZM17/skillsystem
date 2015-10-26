package com.txzm.gameobj;

import java.util.EnumMap;

import com.txzm.attribute.AttributeType;
import com.txzm.gamescheduler.Scheduler;
import com.txzm.gamescheduler.TargetScheduler;

public class Hero extends BaseTarget implements SkillTarget {
	private String name;
	private TargetScheduler scheduler;
	
	public Hero(EnumMap<AttributeType,Integer> attributeMap,String name){
//		EnumMap<AttributeType,Integer> attributeMap = new EnumMap<AttributeType,Integer>();
//		attributeMap.put(AttributeType.Mp, 100);
//		attributeMap.put(AttributeType.Hp, 100);
//		attributeMap.put(AttributeType.Attack, 100);
//		attributeMap.put(AttributeType.Defense, 100);
		super(attributeMap);
		this.name = name;
		scheduler = new TargetScheduler(this);
	}

	@Override
	public void changeMp(int delta) {
		setMp(Math.max(0, getMp()+delta));
		System.out.println(String.format("%s的mp改变了：%d,mp:%d.",name,delta,getMp()));
	}

	@Override
	public void changeHp(int delta) {
		setHp(Math.max(0, getHp()+delta));
		System.out.println(String.format("%s的hp改变了：%d,hp:%d.",name,delta,getHp()));
	}

	@Override
	public Scheduler getSkillScheduler() {
		return scheduler;
	}

}
