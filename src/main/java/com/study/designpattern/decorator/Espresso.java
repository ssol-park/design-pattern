package com.study.designpattern.decorator;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    protected Double cost() {
        return 1.99;
    }
}
