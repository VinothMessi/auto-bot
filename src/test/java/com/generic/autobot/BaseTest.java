package com.generic.autobot;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest
public class BaseTest extends AbstractTestNGSpringContextTests {
    @Value("${app.browser}")
    protected String appBrowser;

    @Value("${app.url}")
    protected String appUrl;

    @Value("${hub.protocol}")
    protected String protocol;

    @Value("${hub.host}")
    protected String host;

    @Value("${hub.port}")
    protected Integer port;

    @Autowired
    protected WebDriver browser;
}