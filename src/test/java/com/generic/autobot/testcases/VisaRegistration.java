package com.generic.autobot.testcases;

import com.generic.autobot.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.awaitility.Awaitility.await;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class VisaRegistration extends BaseTest {
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

        By header = By.id("header_1");
        By subHeader = By.id("subHeader_1");

        String pageHeader = browser.findElement(header).getText().trim();
        String pageSubHeader = browser.findElement(subHeader).getText().trim();

        assertThat(pageHeader, is(equalTo(heading)));
        assertThat(pageSubHeader, is(equalTo(subHeading)));
    }

    @Test
    public void tc_01_fill_user_details() {
        By firstName = By.id("first_4");
        By middleName = By.id("middle_4");
        By lastName = By.id("last_4");

        browser.findElement(firstName).sendKeys("Lionel");
        browser.findElement(middleName).sendKeys("Andrés");
        browser.findElement(lastName).sendKeys("Messi");
    }

    @Test
    public void tc_02_fill_country_details() {
        By fromCountry = By.id("input_46");
        By toCountry = By.id("input_47");

        Select fCountry = new Select(browser.findElement(fromCountry));
        Select tCountry = new Select(browser.findElement(toCountry));

        fCountry.selectByValue("Argentina");
        tCountry.selectByValue("Spain");
    }

    @Test
    public void tc_03_fill_birth_details() {
        By month = By.id("input_24_month");
        By day = By.id("input_24_day");
        By year = By.id("input_24_year");

        Select bMonth = new Select(browser.findElement(month));
        Select bDay = new Select(browser.findElement(day));
        Select bYear = new Select(browser.findElement(year));

        bMonth.selectByValue("JUNE");
        bDay.selectByValue("24");
        bYear.selectByValue("1987");
    }

    @Test
    public void tc_04_fill_contact_details() {
        By userEmail = By.id("input_6");
        By areaCode = By.id("input_27_area");
        By phoneNumber = By.id("input_27_phone");

        browser.findElement(userEmail).sendKeys("Lionel.Messi@gmail.com");
        browser.findElement(areaCode).sendKeys("+54");
        browser.findElement(phoneNumber).sendKeys("1234567890");
    }

    @Test
    public void tc_05_submit_application() throws InterruptedException {
        By comments = By.id("input_45");
        By submit = By.id("submitBtn");

        browser.findElement(comments).sendKeys("Lionel Messi Visa Form");
        browser.findElement(submit).click();
    }

    @Test
    public void tc_06_confirmation() {
        By panel = By.id("panel");
        By requestId = By.id("requestnumber");

        await().atMost(Duration.ofSeconds(10))
                .pollInterval(Duration.ofSeconds(1))
                .until(() -> browser.findElement(requestId).isDisplayed() == true);
        System.out.println("Confirmation Message:" + "\n" + browser.findElement(panel).getText());
    }

    @AfterClass
    public void close_application() {
        browser.quit();
    }
}