package com.itheima.template;

public class CoffeeWithHook extends TemplateMethod {

    public void brew() {
        System.out.println("冲泡");
    }
    public void addCondiments() {
        System.out.println("加糖和牛奶");
    }

    public boolean customerWantsCondiments() {
        //需要加糖和牛奶
        return true;
    }
}
