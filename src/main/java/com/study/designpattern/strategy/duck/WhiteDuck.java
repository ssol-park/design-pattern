package com.study.designpattern.strategy.duck;

import com.study.designpattern.strategy.behaivor.Quack;
import com.study.designpattern.strategy.behaivor.Fly;

public class WhiteDuck extends Duck{
    public WhiteDuck() {
        super.flyBehavior = new Fly();
        super.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println(" WhiteDuck ... ");
    }
}
