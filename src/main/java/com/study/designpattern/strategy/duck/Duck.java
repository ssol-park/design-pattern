package com.study.designpattern.strategy.duck;

import com.study.designpattern.strategy.behaivor.FlyBehavior;
import com.study.designpattern.strategy.behaivor.QuackBehavior;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
