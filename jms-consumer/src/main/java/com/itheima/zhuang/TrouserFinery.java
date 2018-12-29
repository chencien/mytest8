package com.itheima.zhuang;

public class TrouserFinery extends Finery {
 
	public TrouserFinery(People people){
		super(people);
	}
	@Override
	public void wearClothing() {
		people.wearClothing();
		System.out.println("******穿西服裤*******");
	}
	
}
