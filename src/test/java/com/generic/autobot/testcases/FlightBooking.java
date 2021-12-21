package com.generic.autobot.testcases;

import com.generic.autobot.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class FlightBooking extends BaseTest {
    @Value("${flight.url}")
    private String url;

    @Value("${flight.header}")
    private String heading;

    @Value("${flight.subHeader}")
    private String subHeading;

    @BeforeClass
    public void launch_application() {
        browser.manage().window().maximize();
        browser.navigate().to(this.url);

        By header = By.id("header_14");
        By subHeader = By.xpath("(//h1)[2]");

        assertThat(find.the(header).getText().trim(), is(equalTo(heading)));
        assertThat(find.the(subHeader).getText().trim(), is(equalTo(subHeading)));
    }

    @Test
    public void tc_01_fill_contact_information() {
        By firstName = By.name("firstName");
        By lastName = By.name("lastName");
        By phone = By.name("phone");
        By email = By.name("userName");

        find.the(firstName).sendKeys("Lionel");
        find.the(lastName).sendKeys("Messi");
        find.the(phone).sendKeys("1234567890");
        find.the(email).sendKeys("Lionel.Messi@gmail.com");
    }

    @Test
    public void tc_02_fill_mailing_information() {
        By address = By.name("address1");
        By city = By.name("city");
        By state = By.name("state");
        By postalCode = By.name("postalCode");
        By country = By.name("country");

        find.the(address).sendKeys("Rosario, Argentina");
        find.the(city).sendKeys("Bruno Ares");
        find.the(state).sendKeys("Rosario");
        find.the(postalCode).sendKeys("Lionel.Messi@gmail.com");

        Select fCountry = new Select(find.the(country));
        fCountry.selectByValue("ARGENTINA");
    }

    @Test
    public void tc_03_fill_user_information() {
        By userName = By.name("email");
        By password = By.name("password");
        By confirmPassword = By.name("confirmPassword");
        By submit = By.name("register");

        find.the(userName).sendKeys("LionelMessi");
        find.the(password).sendKeys("lionelmessi");
        find.the(confirmPassword).sendKeys("lionelmessi");
        find.the(submit).click();
    }

    @Test
    public void tc_04_fill_flight_details() throws InterruptedException {
        By flights = By.id("flight-link");
        By roundtrip = By.xpath("//input[@value='roundtrip']");
        By oneway = By.xpath("//input[@value='oneway']");
        By passengers = By.name("passCount");
        By departingFrom = By.name("fromPort");
        By arrivingIn = By.name("toPort");
        By fromMonth = By.name("fromMonth");
        By fromDay = By.name("fromDay");
        By toMonth = By.name("toMonth");
        By toDay = By.name("toDay");
        By economyClass = By.xpath("//input[@value='Coach']");
        By businessClass = By.xpath("//input[@value='Business']");
        By firstClass = By.xpath("//input[@value='First']");
        By airline = By.name("airline");

        find.the(flights).click();

        Thread.sleep(3000);
        String type = "oneWay";
        switch (type) {
            case "roundTrip":
                find.the(roundtrip).click();
            case "oneWay":
                find.the(oneway).click();
        }

        Select noOfPassengers = new Select(find.the(passengers));
        Select departingCountry = new Select(find.the(departingFrom));
        Select departingMonth = new Select(find.the(fromMonth));
        Select departingDay = new Select(find.the(fromDay));
        Select arrivingCountry = new Select(find.the(arrivingIn));
        Select arrivingMonth = new Select(find.the(toMonth));
        Select arrivingDay = new Select(find.the(toDay));

        noOfPassengers.selectByValue("2");
        departingCountry.selectByValue("London");
        departingMonth.selectByValue("12");
        departingDay.selectByValue("21");
        arrivingCountry.selectByValue("Paris");
        arrivingMonth.selectByValue("12");
        arrivingDay.selectByValue("22");

        String serviceClass = "businessClass";
        switch (serviceClass) {
            case "economyClass":
                find.the(economyClass).click();
            case "businessClass":
                find.the(businessClass).click();
            case "firstClass":
                find.the(firstClass).click();
        }

        Select airlineName = new Select(find.the(airline));
        airlineName.selectByVisibleText("Unified Airlines");
    }

    @AfterClass
    public void close_application() {
        browser.quit();
    }
}