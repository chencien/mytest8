package com.itheima.dai;

public class Client {
 
	public static void main(String[] args) {
 
		People xiaoming = new Xiaoming();
		People xiaohong = new Xiaohong(xiaoming);
		xiaohong.buyFood();
 
	}
 
}
