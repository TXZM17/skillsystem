package com.txzm.attribute;

public enum AttributeType {
	Hp("Ѫ��"),
	Mp("ħ��ֵ"),
	Attack("������"),
	Defense("������");
	
	private final String value;
	
	private AttributeType(String name){
		this.value = name;
	}
	
	public String getValue(){
		return value;
	}

}
