package com.txzm.attribute;

public enum AttributeType {
	Hp("血量"),
	Mp("魔法值"),
	Attack("攻击力"),
	Defense("防御力");
	
	private final String value;
	
	private AttributeType(String name){
		this.value = name;
	}
	
	public String getValue(){
		return value;
	}

}
