package com.itheima.zhuang;

public class Xiaoming implements People{
	
	private String name;
	
	public Xiaoming(){
		name = "小明";
	}
	public void wearClothing(){
		System.out.println(name+"******开始穿衣服******");
	}
	public String getName() {
		return name;
	}
	
}
