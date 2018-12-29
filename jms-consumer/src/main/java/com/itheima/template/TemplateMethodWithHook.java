package com.itheima.template;

//定义模板方法
public abstract class TemplateMethodWithHook {
    //冲咖啡和泡茶的模板，注意这里的final,意味着该方法不可修改，即模板中方法的先后顺序被固定
    final void template() {
        //烧水
        boilWater();
        //冲泡：用沸水"浸泡"茶叶/用沸水"冲泡"咖啡
        brew();
        //把泡好的饮料倒进杯子
        pourInCup();
        //加调料
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    /**这两个方法交给子类去实现**/
    //茶应该"浸泡"，咖啡应该"冲泡"
    abstract void brew();
    //茶加柠檬，咖啡加牛奶和糖
    abstract void addCondiments();

    /**这两个方法属于公用方法**/
    void boilWater() {
        System.out.println("烧水");
    }
    void pourInCup() {
        System.out.println("倒进杯子");
    }

    //这里是个钩子，子类可决定是否需要加调料。也就是说子类可通过这个hook控制模板定义的逻辑
    boolean customerWantsCondiments() {
        return true;
    }
}
