package com.itheima.fanshe.beanUtils;

import com.itheima.fanshe.Student;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;

import java.util.HashMap;
import java.util.Map;

public class BeanUtilsDemo {
    public static void main(String[] args) throws Exception {
        // 创建map集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "林青霞");
        map.put("gender", "女");
        map.put("age", "38");
        map.put("hobbies", new String[]{"唱歌", "跳舞"});
        // 创建学生对象
        Student stu = new Student();
        System.out.println("封装前：" + stu);
        // 调用BeanUtils工具类的方法将map数据封装到stu中

        // 输出对象stu
        System.out.println("封装后：" + stu);
    }
}