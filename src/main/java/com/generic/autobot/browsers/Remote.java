package com.generic.autobot.browsers;

import com.generic.autobot.properties.Hub;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

import java.net.MalformedURLException;
import java.net.URL;

@Lazy
@Configuration
@Profile("remote")
public class Remote {
    @Autowired
    private Hub hub;

    @Bean
    @ConditionalOnProperty(name = "project.browser", havingValue = "chrome")
    @Scope("browserscope")
    public WebDriver remoteChrome() throws MalformedURLException {
        var options = new ChromeOptions();
        return new RemoteWebDriver(new URL(hub.getProtocol() + "://" + hub.getHost() + ":" + hub.getPort()), options);
    }

    @Bean
    @ConditionalOnProperty(name = "project.browser", havingValue = "edge")
    @Scope("browserscope")
    public WebDriver remoteEdge() throws MalformedURLException {
        var options = new EdgeOptions();
        return new RemoteWebDriver(new URL(hub.getProtocol() + "://" + hub.getHost() + ":" + hub.getPort()), options);
    }

    @Bean
    @ConditionalOnProperty(name = "project.browser", havingValue = "firefox")
    @Scope("browserscope")
    public WebDriver remoteFirefox() throws MalformedURLException {
        var options = new FirefoxOptions();
        return new RemoteWebDriver(new URL(hub.getProtocol() + "://" + hub.getHost() + ":" + hub.getPort()), options);
    }
}