package com.itheima;

public class DanLi2{
     private static DanLi2 instance;
     private DanLi2(){}
    public static synchronized DanLi2 getInstance() {
          if (instance == null) {
              instance = new DanLi2();
          }
          return instance;
    }

}