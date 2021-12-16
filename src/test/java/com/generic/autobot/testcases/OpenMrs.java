package com.generic.autobot.testcases;

import com.generic.autobot.BaseTest;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenMrs extends BaseTest {
    @Value("${openmrs.url}")
    private String openmrs;

    @Value("${openmrs.userName}")
    private String userName;

    @Value("${openmrs.password}")
    private String password;

    @BeforeClass
    public void setUp() {
        browser.manage().window().maximize();
        browser.navigate().to(this.openmrs);
    }

    @Test
    public void logIn() {
        String pageTitle = browser.getTitle();
        System.out.println("Page Title:" + pageTitle);

        browser.findElement(By.id("username")).sendKeys(this.userName);
        browser.findElement(By.id("password")).sendKeys(this.password);
        browser.findElement(By.id("Inpatient Ward")).click();
        browser.findElement(By.id("loginButton")).click();

        browser.findElement(By.xpath("//h4[contains(text(),'Logged in as Super User (admin) at Inpatient Ward.')]"));
    }

    @AfterClass
    public void tearDown() {
        browser.close();
    }
}