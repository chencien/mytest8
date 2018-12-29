package com.itheima.dai3;

import java.util.Random;

public class GirlAgent implements Girl{
        private Girl girl;

    public GirlAgent(Girl girl) {
        super();
        this.girl = girl;
    }

    @Override
    public void behavior() {
        Random rand = new Random();
        if (rand.nextBoolean()){
         //   System.out.println("我安排你们上自习");
            System.out.println("我家MM不但知书达礼，而且还会做饭");
            this.girl.behavior();
        }else {
            System.out.println("先看你的表现，上自习以后再说");
        }

    }
}
