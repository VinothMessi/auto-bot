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

public class FlightBooking extends BaseTest {
    By header = By.id("header_14");
    By subHeader = By.xpath("(//h1)[2]");

    @Value("${flight.url}")
    private String flight;

    @Value("${flight.header}")
    private String heading;

    @Value("${flight.subHeader}")
    private String subHeading;

    @BeforeClass
    public void launch_application() {
        browser.manage().window().maximize();
        browser.navigate().to(flight);
        assertThat(browser.findElement(header).getText().trim(), is(equalTo(heading)));
        assertThat(browser.findElement(subHeader).getText().trim(), is(equalTo(subHeading)));
    }

    @Test
    public void flight_booking() {
        System.out.println("Flight Booking");
    }

    @AfterClass
    public void close_application() {
        browser.close();
    }
}