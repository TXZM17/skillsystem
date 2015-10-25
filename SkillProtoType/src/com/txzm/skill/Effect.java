package com.txzm.skill;

import com.txzm.gameobj.SkillTarget;

public interface Effect {
	public void cast(SkillTarget target);
	default void reverse(){
		
	}
}
