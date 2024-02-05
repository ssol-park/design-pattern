package com.study.designpattern.decorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    protected Double cost() {
        return 1.00 + beverage.cost();
    }

    @Override
    protected String getDescription() {
        return "Soy " + beverage.getDescription();
    }
}
