package com.generic.autobot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest
public class BaseTest extends AbstractTestNGSpringContextTests {
    @Value("${app.browser}")
    protected String browser;

    @Value("${app.url}")
    protected String url;

    @Value("${hub.protocol}")
    protected String protocol;

    @Value("${hub.host}")
    protected String host;

    @Value("${hub.port}")
    protected Integer port;
}