package com.generic.autobot.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;

@Lazy
@Configuration
@Profile("local")
public class Local {
    @Bean
    @ConditionalOnProperty(name = "project.browser", havingValue = "chrome")
    public WebDriver chrome() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(name = "project.browser", havingValue = "headlessChrome")
    public WebDriver headlessChrome() {
        WebDriverManager.chromedriver().setup();
        var options = new ChromeOptions();
        options.setHeadless(true);
        return new ChromeDriver(options);
    }

    @Bean
    @ConditionalOnProperty(name = "project.browser", havingValue = "edge")
    public WebDriver edge() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    @Bean
    @ConditionalOnProperty(name = "project.browser", havingValue = "firefox")
    public WebDriver firefox() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    @Bean
    @ConditionalOnProperty(name = "project.browser", havingValue = "headlessFirefox")
    public WebDriver headlessFirefox() {
        WebDriverManager.firefoxdriver().setup();
        var options = new FirefoxOptions();
        options.setHeadless(true);
        return new FirefoxDriver(options);
    }
}