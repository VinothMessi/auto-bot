package com.generic.autobot.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Element {
    public void clear(WebElement element) {
        element.clear();
    }

    public void click(WebElement element) {element.click();}

    public void submit(WebElement element) {
        element.submit();
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public String getTagName(WebElement element) {
        return element.getTagName();
    }

    public String getAttribute(WebElement element, String name) {
        return element.getAttribute(name);
    }

    public String getCssValue(WebElement element, String propertyName) {
        return element.getCssValue(propertyName);
    }

    public String getDomAttribute(WebElement element, String name) {
        return element.getDomAttribute(name);
    }

    public String getDomProperty(WebElement element, String name) {
        return element.getDomProperty(name);
    }

    public Boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public Boolean isEnabled(WebElement element) {
        return element.isEnabled();
    }

    public Boolean isSelected(WebElement element) {
        return element.isSelected();
    }
}