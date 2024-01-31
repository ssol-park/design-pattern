package com.study.designpattern.strategy.duck;

import com.study.designpattern.strategy.behaivor.Quack;
import com.study.designpattern.strategy.behaivor.fly;

public class QuietDuck extends Duck{
    public QuietDuck() {
        super.flyBehavior = new fly();
        super.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println(" QuietDuck ... ");
    }
}
