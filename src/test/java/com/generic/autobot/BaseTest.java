package com.generic.autobot;

import com.generic.autobot.elements.Find;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;

@SpringBootTest
public class BaseTest extends AbstractTestNGSpringContextTests {
    @Autowired
    protected WebDriver browser;

    protected Find find;

    @BeforeClass
    public void setUp() {
        find = new Find(browser);
    }
}