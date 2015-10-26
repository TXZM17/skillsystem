package com.txzm.effect;

import java.lang.annotation.Target;
import java.util.List;

public interface Aoe {
	void onTargetEntrance(Target target);
	void onTargetLeave(Target target);
	List<Target> getAreaTarget();
	void onAreaTick();
}
