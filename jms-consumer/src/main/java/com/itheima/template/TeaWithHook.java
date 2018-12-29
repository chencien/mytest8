package com.itheima.template;

public class TeaWithHook extends TemplateMethod {

    public void brew() {
        System.out.println("浸泡");
    }
    public void addCondiments() {
        System.out.println("加柠檬");
    }

    public boolean customerWantsCondiments() {
        //不需要加柠檬
        return false;
    }
}
