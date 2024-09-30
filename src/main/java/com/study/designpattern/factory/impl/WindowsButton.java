package com.study.designpattern.factory.impl;

import com.study.designpattern.factory.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Sky Blue");
    }
}
