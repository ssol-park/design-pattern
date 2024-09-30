package com.study.designpattern.factory;

import com.study.designpattern.factory.impl.MacOSButton;
import com.study.designpattern.factory.impl.WindowsButton;

public class ButtonFactory {

    public static Button createButton() {
        String osName = System.getProperty("os.name").toLowerCase();

        if ("mac".equals(osName))
            return new MacOSButton();
        else
            return new WindowsButton();
    }
}
