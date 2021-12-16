package com.generic.autobot.testcases;

import com.generic.autobot.BaseTest;
import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lennox extends BaseTest {
    @Value("${lennox.url}")
    private String lennox;

    @Value("${lennox.userName}")
    private String userName;

    @Value("${lennox.password}")
    private String password;

    @BeforeClass
    public void setUp() {
        browser.manage().window().maximize();
        browser.navigate().to(this.lennox);
    }

    @Test
    public void logIn() {
        String pageTitle = browser.getTitle();
        System.out.println("Page Title:" + pageTitle);

        browser.findElement(By.id("samlSignInLink")).click();

        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        browser.findElement(By.id("signInName")).sendKeys(this.userName);
        browser.findElement(By.id("password")).sendKeys(this.password);
        browser.findElement(By.id("continue")).click();

        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(10));
        browser.findElement(By.xpath("//span[text()='lenpro automation8']")).isDisplayed();
    }

    @AfterClass
    public void tearDown() {
        browser.close();
    }
}