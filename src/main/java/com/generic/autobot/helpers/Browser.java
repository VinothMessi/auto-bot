package com.generic.autobot.helpers;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Browser {
    private WebDriver lDriver;

    public Browser(WebDriver driver) {
        this.lDriver = driver;
    }

    public void quit() {
        this.lDriver.quit();
    }

    public void close() {
        this.lDriver.close();
    }

    public void maximize() {
        this.lDriver.manage().window().maximize();
    }

    public void getTo(String url) {
        this.lDriver.get(url);
    }

    public void navigateTo(String url) {
        this.lDriver.navigate().to(url);
    }

    public String getPageTitle() {
        return this.lDriver.getTitle();
    }

    public String getCurrentUrl() {
        return this.lDriver.getCurrentUrl();
    }

    public String getPageSource() {
        return this.lDriver.getPageSource();
    }

    public String getWindowHandle() {
        return this.lDriver.getWindowHandle();
    }

    public Set<String> getWindowHandles() {
        return this.lDriver.getWindowHandles();
    }
}