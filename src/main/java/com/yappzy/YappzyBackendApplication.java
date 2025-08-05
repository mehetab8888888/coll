package com.yappzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.yappzy.config.CorsProperties;

@SpringBootApplication
@EnableConfigurationProperties(CorsProperties.class)
public class YappzyBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YappzyBackendApplication.class, args);
    }
}
