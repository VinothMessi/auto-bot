package com.generic.autobot.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
@ConfigurationProperties("project")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    private String name;
    private String browser;

    private String reportPath;
    private String reportName;
    private String reportFormat;

    private String logPath;
    private String logName;
    private String logFormat;

    private String snapPath;
    private String dataPath;
}