package com.itheima.dai;

public class Xiaohong implements People {
 
	private People people;
	
	public Xiaohong(People people){
		this.people = people;
	}

	public void buyFood() {
		System.out.println("帮别人去买饭");
		people.buyFood();
	}
 
}
