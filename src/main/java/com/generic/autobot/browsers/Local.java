package com.generic.autobot.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

@Lazy
@Configuration
@Profile("local")
public class Local {
    @Bean
    @ConditionalOnProperty(name = "project.browser", havingValue = "chrome")
    @Scope("browserscope")
    public WebDriver chrome() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(name = "project.browser", havingValue = "headlessChrome")
    @Scope("browserscope")
    public WebDriver headlessChrome() {
        WebDriverManager.chromedriver().setup();
        var options = new ChromeOptions();
        options.setHeadless(true);
        return new ChromeDriver(options);
    }

    @Bean
    @ConditionalOnProperty(name = "project.browser", havingValue = "edge")
    @Scope("browserscope")
    public WebDriver edge() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    @Bean
    @ConditionalOnProperty(name = "project.browser", havingValue = "firefox")
    @Scope("browserscope")
    public WebDriver firefox() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    @Bean
    @ConditionalOnProperty(name = "project.browser", havingValue = "headlessFirefox")
    @Scope("browserscope")
    public WebDriver headlessFirefox() {
        WebDriverManager.firefoxdriver().setup();
        var options = new FirefoxOptions();
        options.setHeadless(true);
        return new FirefoxDriver(options);
    }
}