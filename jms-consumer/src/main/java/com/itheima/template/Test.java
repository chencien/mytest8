package com.itheima.template;

public class Test {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        //泡茶
        tea.template();
        //冲咖啡
        coffee.template();
    }
}
