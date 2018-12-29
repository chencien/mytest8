package com.itheima.dai2;

/**
 * 具体的实现类
 * 
 * @author onlyone
 */
public class RealPersonManager implements PersonManager {
 

    public double getSalary(String name, String operateName) {
 
        // 查询数据库，返回具体的工资数
        return 1000000;
    }
 
}
