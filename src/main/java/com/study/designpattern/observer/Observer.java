package com.study.designpattern.observer;

public interface Observer {
    void update(float temp, float humidity, float pressure); // for push
    void update(); // for pull
}
