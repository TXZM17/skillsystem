package com.txzm.attribute;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.txzm.gameobj.BaseTarget;

public class AttributeComponent {
	private EnumMap<AttributeType, Integer> attributeMap;
	private BaseTarget target;
	private Map<AttributeType, TreeMap<Integer, List<AttributeCalculator>>> topMap;

	public AttributeComponent(BaseTarget target) {
		this.target = target;
		attributeMap = new EnumMap<AttributeType, Integer>(AttributeType.class);
		topMap = new EnumMap<AttributeType, TreeMap<Integer, List<AttributeCalculator>>>(
				AttributeType.class);
	}

	public void updateAttribute(AttributeType type) {
		TreeMap<Integer, List<AttributeCalculator>> map = topMap.get(type);
		int base = target.getAttribute(type);
		int result = base;
		if (map != null && map.size() > 0) {
			for (Integer key : map.keySet()) {
				List<AttributeCalculator> cals = map.get(key);
				if (cals != null && cals.size() > 0) {
					for (AttributeCalculator cal : cals) {
						result = cal.calculate(base, result);
					}
				}
			}
		}
		attributeMap.put(type, result);
	}
	
	public int getAttribute(AttributeType type){
		Integer value = attributeMap.get(type);
		if(value==null){
			value = target.getAttribute(type);
		}
		return value;
	}
	
	public void addCalculator(AttributeType type,AttributeCalculator cal){
		//TODO
	}
	
	public void removeCalculator(AttributeType type,int calId){
		//TODO
	}

}
