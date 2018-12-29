package com.itheima.dai3;

public class Client {
    public static void main(String[] args) {
        Girl niceGirl=new NiceGirl("小美");
        Girl friend=new GirlAgent(niceGirl);
        friend.behavior();
    }
}
