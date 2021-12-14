package com.generic.autobot.testcases;

import com.generic.autobot.BaseTest;
import org.testng.annotations.Test;

public class AutomationPractice extends BaseTest {
    @Test
    public void sanity() {
        browser.manage().window().maximize();
        browser.navigate().to(appUrl);
        System.out.println("Page Title:" + browser.getTitle());
        browser.quit();
    }
}