package com.generic.autobot.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Find {
    private static WebDriver lDriver;

    public Find(WebDriver driver) {
        this.lDriver = driver;
    }

    public static WebElement by(String attribute, String value) {
        switch (attribute) {
            case "id":
                return lDriver.findElement(By.id(value));
            case "name":
                return lDriver.findElement(By.name(value));
            case "className":
                return lDriver.findElement(By.className(value));
            case "linkText":
                return lDriver.findElement(By.linkText(value));
            case "partialLinkText":
                return lDriver.findElement(By.partialLinkText(value));
            case "tagName":
                return lDriver.findElement(By.tagName(value));
            case "xpath":
                return lDriver.findElement(By.xpath(value));
            case "css":
                return lDriver.findElement(By.cssSelector(value));
            default:
                return null;
        }
    }

    public static WebElement above(By element, String attribute, String value) {
        switch (attribute) {
            case "id":
                return lDriver.findElement(with(By.id(value)).above(element));
            case "name":
                return lDriver.findElement(with(By.name(value)).above(element));
            case "className":
                return lDriver.findElement(with(By.className(value)).above(element));
            case "linkText":
                return lDriver.findElement(with(By.linkText(value)).above(element));
            case "partialLinkText":
                return lDriver.findElement(with(By.partialLinkText(value)).above(element));
            case "tagName":
                return lDriver.findElement(with(By.tagName(value)).above(element));
            case "xpath":
                return lDriver.findElement(with(By.xpath(value)).above(element));
            case "css":
                return lDriver.findElement(with(By.cssSelector(value)).above(element));
            default:
                return null;
        }
    }

    public static WebElement below(By element, String attribute, String value) {
        switch (attribute) {
            case "id":
                return lDriver.findElement(with(By.id(value)).below(element));
            case "name":
                return lDriver.findElement(with(By.name(value)).below(element));
            case "className":
                return lDriver.findElement(with(By.className(value)).below(element));
            case "linkText":
                return lDriver.findElement(with(By.linkText(value)).below(element));
            case "partialLinkText":
                return lDriver.findElement(with(By.partialLinkText(value)).below(element));
            case "tagName":
                return lDriver.findElement(with(By.tagName(value)).below(element));
            case "xpath":
                return lDriver.findElement(with(By.xpath(value)).below(element));
            case "css":
                return lDriver.findElement(with(By.cssSelector(value)).below(element));
            default:
                return null;
        }
    }

    public static WebElement near(By element, String attribute, String value) {
        switch (attribute) {
            case "id":
                return lDriver.findElement(with(By.id(value)).near(element));
            case "name":
                return lDriver.findElement(with(By.name(value)).near(element));
            case "className":
                return lDriver.findElement(with(By.className(value)).near(element));
            case "linkText":
                return lDriver.findElement(with(By.linkText(value)).near(element));
            case "partialLinkText":
                return lDriver.findElement(with(By.partialLinkText(value)).near(element));
            case "tagName":
                return lDriver.findElement(with(By.tagName(value)).near(element));
            case "xpath":
                return lDriver.findElement(with(By.xpath(value)).near(element));
            case "css":
                return lDriver.findElement(with(By.cssSelector(value)).near(element));
            default:
                return null;
        }
    }

    public static WebElement toRightOf(By element, String attribute, String value) {
        switch (attribute) {
            case "id":
                return lDriver.findElement(with(By.id(value)).toRightOf(element));
            case "name":
                return lDriver.findElement(with(By.name(value)).toRightOf(element));
            case "className":
                return lDriver.findElement(with(By.className(value)).toRightOf(element));
            case "linkText":
                return lDriver.findElement(with(By.linkText(value)).toRightOf(element));
            case "partialLinkText":
                return lDriver.findElement(with(By.partialLinkText(value)).toRightOf(element));
            case "tagName":
                return lDriver.findElement(with(By.tagName(value)).toRightOf(element));
            case "xpath":
                return lDriver.findElement(with(By.xpath(value)).toRightOf(element));
            case "css":
                return lDriver.findElement(with(By.cssSelector(value)).toRightOf(element));
            default:
                return null;
        }
    }

    public static WebElement toLeftOf(By element, String attribute, String value) {
        switch (attribute) {
            case "id":
                return lDriver.findElement(with(By.id(value)).toLeftOf(element));
            case "name":
                return lDriver.findElement(with(By.name(value)).toLeftOf(element));
            case "className":
                return lDriver.findElement(with(By.className(value)).toLeftOf(element));
            case "linkText":
                return lDriver.findElement(with(By.linkText(value)).toLeftOf(element));
            case "partialLinkText":
                return lDriver.findElement(with(By.partialLinkText(value)).toLeftOf(element));
            case "tagName":
                return lDriver.findElement(with(By.tagName(value)).toLeftOf(element));
            case "xpath":
                return lDriver.findElement(with(By.xpath(value)).toLeftOf(element));
            case "css":
                return lDriver.findElement(with(By.cssSelector(value)).toLeftOf(element));
            default:
                return null;
        }
    }
}