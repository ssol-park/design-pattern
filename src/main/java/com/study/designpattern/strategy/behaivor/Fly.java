package com.study.designpattern.strategy.behaivor;

public class Fly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly!!");
    }
}
