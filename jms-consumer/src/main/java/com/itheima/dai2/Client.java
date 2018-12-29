package com.itheima.dai2;

public class Client {
    public static void main(String[] args) {
     //   RealPersonManager realPersonManager = new RealPersonManager();
        ProxyPersonManager proxyPersonManager = new ProxyPersonManager();
        double salary = proxyPersonManager.getSalary("小迷宫", "小糊涂");
        System.out.println(salary);
    }
}
