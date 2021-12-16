package com.generic.autobot;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest
public class BaseTest extends AbstractTestNGSpringContextTests {
    @Autowired
    protected WebDriver browser;
}