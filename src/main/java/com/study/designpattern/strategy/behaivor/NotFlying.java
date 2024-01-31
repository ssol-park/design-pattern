package com.study.designpattern.strategy.behaivor;

public class NotFlying implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Not fly...");
    }
}
