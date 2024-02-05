package com.study.designpattern.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    protected Double cost() {
        return .89;
    }
}
