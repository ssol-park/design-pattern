package com.study.designpattern.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorMain {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        log.info("Espresso, desc:{}, cost:{}", beverage.getDescription(), beverage.cost());

        beverage = new Mocha(beverage);
        log.info("extraOption, desc:{}, cost:{}", beverage.getDescription(), beverage.cost());

        beverage = new Soy(beverage);
        log.info("extraOption2, desc:{}, cost:{}", beverage.getDescription(), beverage.cost());
    }
}
