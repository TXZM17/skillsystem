package com.txzm.skill;

import com.txzm.gameobj.SkillTarget;

public abstract class Skill extends EffectContainer {
	
	public void spellTo(SkillTarget target){
		for(Effect effect: this.getEffects()){
			effect.cast(target);
		}
	}

}
