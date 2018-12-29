package com.itheima.dai2;

/**
 * 个人信息管理
 * @author onlyone 
 */
public interface PersonManager {
 
    /**
     * 查询工资
     * @param name 被查人的名字
     * @param operateName 操作人名字
     */
    public double getSalary(String name,String operateName);
}
