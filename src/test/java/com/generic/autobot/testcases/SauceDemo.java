package com.generic.autobot.testcases;

import com.generic.autobot.BaseTest;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SauceDemo extends BaseTest {
    @Value("${sauce.url}")
    private String sauce;

    @Value("${sauce.userName}")
    private String userName;

    @Value("${sauce.password}")
    private String password;

    @BeforeClass
    public void setUp() {
        browser.manage().window().maximize();
        browser.navigate().to(this.sauce);
    }

    @Test
    public void logIn() {
        String pageTitle = browser.getTitle();
        System.out.println("Page Title:" + pageTitle);

        browser.findElement(By.id("user-name")).sendKeys(this.userName);
        browser.findElement(By.id("password")).sendKeys(this.password);
        browser.findElement(By.id("login-button")).click();

        browser.findElement(By.className("app_logo")).isDisplayed();
    }

    @AfterClass
    public void tearDown() {
        browser.close();
    }
}