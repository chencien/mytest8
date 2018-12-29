package com.itheima.zhuang;

public class ShirtFinery extends Finery {
 
	public ShirtFinery(People people){
		super(people);
	}
	@Override
	public void wearClothing() {
		people.wearClothing();
		System.out.println("******穿衬衫******");
	}
 
}
