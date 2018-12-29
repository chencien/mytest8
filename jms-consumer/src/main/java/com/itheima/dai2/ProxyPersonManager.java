package com.itheima.dai2;

/**
 * 代理类
 * 
 * @author onlyone
 */
public class ProxyPersonManager implements PersonManager {
 
    // 接口引用
    PersonManager realPersonManager = new RealPersonManager();
 

    public double getSalary(String name, String operateName) {
 
        // 1. 增加一些的权限判断。比如操作人是否有查询某人工资的权限
        // 2. 具体类的调用
        return realPersonManager.getSalary(name, operateName);
    }
 
}
