package com.study.designpattern.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    protected Double cost() {
        return .20 + beverage.cost();
    }

    @Override
    protected String getDescription() {
        return "Mocha " + beverage.description;
    }
}
