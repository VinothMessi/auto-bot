package com.generic.autobot.elements;

import com.generic.autobot.enums.Attribute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Find {
    private WebDriver lDriver;

    public Find(WebDriver driver) {
        this.lDriver = driver;
    }

    public WebElement the(By by) {
        return lDriver.findElement(by);
    }

    public WebElement above(By element, By by) {
        return lDriver.findElement(with(by).above(element));
    }

    public WebElement below(By element, By by) {
        return lDriver.findElement(with(by).below(element));
    }

    public WebElement near(By element, By by) {
        return lDriver.findElement(with(by).near(element));
    }

    public WebElement toRightOf(By element, By by) {
        return lDriver.findElement(with(by).toRightOf(element));
    }

    public WebElement toLeftOf(By element, By by) {
        return lDriver.findElement(with(by).toLeftOf(element));
    }

    public WebElement by(Attribute attribute, String value) {
        switch (attribute) {
            case ID:
                return lDriver.findElement(By.id(value));
            case NAME:
                return lDriver.findElement(By.name(value));
            case CLASS_NAME:
                return lDriver.findElement(By.className(value));
            case LINK_TEXT:
                return lDriver.findElement(By.linkText(value));
            case PARTIAL_LINK_TEXT:
                return lDriver.findElement(By.partialLinkText(value));
            case TAG_NAME:
                return lDriver.findElement(By.tagName(value));
            case XPATH:
                return lDriver.findElement(By.xpath(value));
            case CSS:
                return lDriver.findElement(By.cssSelector(value));
            default:
                return null;
        }
    }

    public WebElement above(By element, Attribute attribute, String value) {
        switch (attribute) {
            case ID:
                return lDriver.findElement(with(By.id(value)).above(element));
            case NAME:
                return lDriver.findElement(with(By.name(value)).above(element));
            case CLASS_NAME:
                return lDriver.findElement(with(By.className(value)).above(element));
            case LINK_TEXT:
                return lDriver.findElement(with(By.linkText(value)).above(element));
            case PARTIAL_LINK_TEXT:
                return lDriver.findElement(with(By.partialLinkText(value)).above(element));
            case TAG_NAME:
                return lDriver.findElement(with(By.tagName(value)).above(element));
            case XPATH:
                return lDriver.findElement(with(By.xpath(value)).above(element));
            case CSS:
                return lDriver.findElement(with(By.cssSelector(value)).above(element));
            default:
                return null;
        }
    }

    public WebElement below(By element, Attribute attribute, String value) {
        switch (attribute) {
            case ID:
                return lDriver.findElement(with(By.id(value)).below(element));
            case NAME:
                return lDriver.findElement(with(By.name(value)).below(element));
            case CLASS_NAME:
                return lDriver.findElement(with(By.className(value)).below(element));
            case LINK_TEXT:
                return lDriver.findElement(with(By.linkText(value)).below(element));
            case PARTIAL_LINK_TEXT:
                return lDriver.findElement(with(By.partialLinkText(value)).below(element));
            case TAG_NAME:
                return lDriver.findElement(with(By.tagName(value)).below(element));
            case XPATH:
                return lDriver.findElement(with(By.xpath(value)).below(element));
            case CSS:
                return lDriver.findElement(with(By.cssSelector(value)).below(element));
            default:
                return null;
        }
    }

    public WebElement near(By element, Attribute attribute, String value) {
        switch (attribute) {
            case ID:
                return lDriver.findElement(with(By.id(value)).near(element));
            case NAME:
                return lDriver.findElement(with(By.name(value)).near(element));
            case CLASS_NAME:
                return lDriver.findElement(with(By.className(value)).near(element));
            case LINK_TEXT:
                return lDriver.findElement(with(By.linkText(value)).near(element));
            case PARTIAL_LINK_TEXT:
                return lDriver.findElement(with(By.partialLinkText(value)).near(element));
            case TAG_NAME:
                return lDriver.findElement(with(By.tagName(value)).near(element));
            case XPATH:
                return lDriver.findElement(with(By.xpath(value)).near(element));
            case CSS:
                return lDriver.findElement(with(By.cssSelector(value)).near(element));
            default:
                return null;
        }
    }

    public WebElement toRightOf(By element, Attribute attribute, String value) {
        switch (attribute) {
            case ID:
                return lDriver.findElement(with(By.id(value)).toRightOf(element));
            case NAME:
                return lDriver.findElement(with(By.name(value)).toRightOf(element));
            case CLASS_NAME:
                return lDriver.findElement(with(By.className(value)).toRightOf(element));
            case LINK_TEXT:
                return lDriver.findElement(with(By.linkText(value)).toRightOf(element));
            case PARTIAL_LINK_TEXT:
                return lDriver.findElement(with(By.partialLinkText(value)).toRightOf(element));
            case TAG_NAME:
                return lDriver.findElement(with(By.tagName(value)).toRightOf(element));
            case XPATH:
                return lDriver.findElement(with(By.xpath(value)).toRightOf(element));
            case CSS:
                return lDriver.findElement(with(By.cssSelector(value)).toRightOf(element));
            default:
                return null;
        }
    }

    public WebElement toLeftOf(By element, Attribute attribute, String value) {
        switch (attribute) {
            case ID:
                return lDriver.findElement(with(By.id(value)).toLeftOf(element));
            case NAME:
                return lDriver.findElement(with(By.name(value)).toLeftOf(element));
            case CLASS_NAME:
                return lDriver.findElement(with(By.className(value)).toLeftOf(element));
            case LINK_TEXT:
                return lDriver.findElement(with(By.linkText(value)).toLeftOf(element));
            case PARTIAL_LINK_TEXT:
                return lDriver.findElement(with(By.partialLinkText(value)).toLeftOf(element));
            case TAG_NAME:
                return lDriver.findElement(with(By.tagName(value)).toLeftOf(element));
            case XPATH:
                return lDriver.findElement(with(By.xpath(value)).toLeftOf(element));
            case CSS:
                return lDriver.findElement(with(By.cssSelector(value)).toLeftOf(element));
            default:
                return null;
        }
    }
}