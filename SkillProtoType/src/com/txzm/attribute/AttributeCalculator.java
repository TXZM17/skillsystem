package com.txzm.attribute;

public abstract class AttributeCalculator {
	private static long _id; 
	private long id;
	private int priority;
	
	public AttributeCalculator(int priority){
		id = refId();
		this.priority = priority;
	}
	
	public abstract int calculate(int baseAttribure,int accumulateAttribute);
	public abstract int getPriority();
	public static long refId(){
		return _id++;
	}
}
