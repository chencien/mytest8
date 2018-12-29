package com.itheima;

public class MianClass
{
public static void main(String[] args) {
    //实例化站台对象，并为每一个站台取名字
    ThreadTest thredTest1=new ThreadTest("窗口1");
    ThreadTest thredTest2=new ThreadTest("窗口2");
    ThreadTest thredTest3=new ThreadTest("窗口3");
    
    //同时开启三个线程
    thredTest1.start();
    thredTest2.start();
    thredTest3.start();
}
}
