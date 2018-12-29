package com.itheima;

public class Singleton {
    private static Singleton instsnce;
    private Singleton(){}
    public static synchronized Singleton getInstsnce() {
        if (instsnce==null){
            instsnce=new Singleton();
        }
        return instsnce;
    }
}
