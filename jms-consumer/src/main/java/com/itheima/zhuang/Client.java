package com.itheima.zhuang;

public class Client {
 
	public static void main(String[] args) {
		People people = new Xiaoming();
		Finery shirtFinery = new ShirtFinery(people);
		Finery trouserFinery = new TrouserFinery(shirtFinery);
		Finery shoesFinery = new ShoesFinery(trouserFinery);
		shoesFinery.wearClothing();
	}
 
}
