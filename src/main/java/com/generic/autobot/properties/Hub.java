package com.generic.autobot.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
@ConfigurationProperties("hub")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hub {
    private String protocol;
    private String host;
    private String port;
}