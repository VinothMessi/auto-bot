package com.generic.autobot.testcases;

import com.generic.autobot.BaseTest;
import org.testng.annotations.Test;

public class AutomationPractice extends BaseTest {
    @Test
    public void sanity() {
        System.out.println(browser);
        System.out.println(url);
        System.out.println(protocol);
        System.out.println(host);
        System.out.println(port);
    }
}