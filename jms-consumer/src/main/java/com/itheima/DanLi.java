package com.itheima;

 public class DanLi {
     private static DanLi instance = new DanLi();
     private DanLi(){}
     public static DanLi getInstance() {
         return instance;
     }
 }



