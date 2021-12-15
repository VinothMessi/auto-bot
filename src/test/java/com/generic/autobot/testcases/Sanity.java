package com.generic.autobot.testcases;

import com.generic.autobot.BaseTest;
import org.testng.annotations.Test;

public class Sanity extends BaseTest {
    @Test
    public void sanity() {
        browser.manage().window().maximize();

        System.out.println(project.getName());
        System.out.println(project.getBrowser());

        System.out.println(project.getReportPath());
        System.out.println(project.getReportName());
        System.out.println(project.getReportFormat());

        System.out.println(project.getLogPath());
        System.out.println(project.getLogName());
        System.out.println(project.getLogFormat());

        System.out.println(project.getSnapPath());
        System.out.println(project.getDataPath());

        browser.quit();
    }
}