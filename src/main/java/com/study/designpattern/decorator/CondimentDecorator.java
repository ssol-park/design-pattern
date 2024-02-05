package com.study.designpattern.decorator;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    protected abstract String getDescription();
}
