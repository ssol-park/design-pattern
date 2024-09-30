package com.study.designpattern.factory.impl;

import com.study.designpattern.factory.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Black");
    }
}
