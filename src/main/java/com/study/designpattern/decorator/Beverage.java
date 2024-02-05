package com.study.designpattern.decorator;

public abstract class Beverage {
    protected String description = "제목 없음";

    protected String getDescription() {
        return description;
    }

    protected abstract Double cost();
}
