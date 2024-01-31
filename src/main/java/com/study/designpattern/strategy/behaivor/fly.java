package com.study.designpattern.strategy.behaivor;

public class fly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly!!");
    }
}
