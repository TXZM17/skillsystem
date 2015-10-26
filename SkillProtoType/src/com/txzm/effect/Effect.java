package com.txzm.effect;

import com.txzm.gameobj.SkillTarget;

public interface Effect {
	public void cast(SkillTarget target);
	default void reverse(){
		
	}
}
