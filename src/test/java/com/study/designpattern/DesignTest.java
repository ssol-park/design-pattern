package com.study.designpattern;

import com.study.designpattern.factory.Button;
import com.study.designpattern.factory.ButtonFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignTest {

    @Test
    void testFactory() {
        Button button = ButtonFactory.createButton();
        button.paint();
    }
}
