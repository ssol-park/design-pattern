package com.study.designpattern.strategy;

import com.study.designpattern.strategy.duck.Duck;
import com.study.designpattern.strategy.duck.WhiteDuck;

public class StrategyMain {
    public static void main(String[] args) {

        Duck duck = new WhiteDuck();
        duck.display();

        System.out.println("==================");

        duck.performFly();
        duck.performQuack();
    }
}
