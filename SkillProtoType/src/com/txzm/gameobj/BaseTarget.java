package com.txzm.gameobj;

import java.util.EnumMap;

import com.txzm.attribute.AttributeType;

public abstract class BaseTarget {
	private EnumMap<AttributeType,Integer> attributeMap;
	
	public Integer getAttribute(AttributeType type){
		return attributeMap.get(type);
	}
	
	public BaseTarget(EnumMap<AttributeType,Integer> attributeMap){
		this.attributeMap = attributeMap;
	}
	
	public int getHp() {
		return attributeMap.get(AttributeType.Hp);
	}
	
	public void setHp(int hp) {
		attributeMap.put(AttributeType.Hp,hp);
	}
	
	public int getMp() {
		return attributeMap.get(AttributeType.Mp);
	}
	
	public void setMp(int mp) {
		attributeMap.put(AttributeType.Mp,mp);
	}
	
	public int getAttack() {
		return attributeMap.get(AttributeType.Attack);
	}
	
	public void setAttack(int attack) {
		attributeMap.put(AttributeType.Attack,attack);
	}
	
	public int getDefense() {
		return attributeMap.get(AttributeType.Defense);
	}
	
	public void setDefense(int defense) {
		attributeMap.put(AttributeType.Defense,defense);
	}

}
