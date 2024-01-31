package com.study.designpattern.strategy;

import com.study.designpattern.strategy.duck.Duck;
import com.study.designpattern.strategy.duck.QuietDuck;

public class StrategyMain {
    public static void main(String[] args) {

        Duck duck = new QuietDuck();
        duck.display();

        System.out.println("==================");

        duck.performFly();
        duck.performQuack();
    }
}
