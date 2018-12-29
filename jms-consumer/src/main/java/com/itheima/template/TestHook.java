package com.itheima.template;

public class TestHook {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        //泡茶，不加柠檬
        teaHook.template();
        //冲咖啡，加糖和牛奶
        coffeeHook.template();
    }
}
