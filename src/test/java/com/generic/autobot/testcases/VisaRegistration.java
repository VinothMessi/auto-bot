package com.generic.autobot.testcases;

import com.generic.autobot.BaseTest;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class VisaRegistration extends BaseTest {
    By header = By.id("header_1");
    By subHeader = By.id("subHeader_1");

    @Value("${visa.url}")
    private String visa;

    @Value("${visa.header}")
    private String heading;

    @Value("${visa.subHeader}")
    private String subHeading;

    @BeforeClass
    public void launch_application() {
        browser.manage().window().maximize();
        browser.navigate().to(visa);
        assertThat(browser.findElement(header).getText().trim(), is(equalTo(heading)));
        assertThat(browser.findElement(subHeader).getText().trim(), is(equalTo(subHeading)));
    }

    @Test
    public void visa_registration() {
        System.out.println("Visa Registration");
    }

    @AfterClass
    public void close_application() {
        browser.close();
    }
}