package com.itheima.fanshe;

import org.springframework.test.context.TestExecutionListeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class1 {
    //a. 获得字节码对象

    public static void fun01() throws Exception {
        //1. 对象.getClass()


        //2. Class.forName("类的全限定名");
        Class clazz02 = Class.forName("com.itheima.fanshe.Student");

        //3. 类.class(JDBCTemplate里面就用过)
        Class clazz03 =  Student.class;

    }

    public static void main(String[] args) throws Exception {
        Student student = new Student("大神", 12);
        Class clazz = Class.forName("com.itheima.fanshe.Student");
        //得到所有声明的方法
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        Method fun1 = clazz.getDeclaredMethod("fun1",String.class);
        fun1.invoke(student,"真实的");
       /* Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);
        System.out.println(clazz.getDeclaredField("age"));
        name.setAccessible(true);
        Object o = name.get(student);
        System.out.println(o);*/
        //        Class clazz = student.getClass();
/*        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());
        Student o = (Student)clazz.newInstance();
        o.fun1();
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();*/
        Constructor constructor = clazz.getConstructor(String.class, int.class);
    //    constructor.setAccessible(true);
      /*  Student o1 =(Student) constructor.newInstance("大神", 12);
        System.out.println(o1.getName());*/

    }
}
