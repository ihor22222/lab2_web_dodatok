package com.webspring.lab2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
@Configuration
@ComponentScan(basePackages = "com.webspring.lab2")
public class AppConfig {

}

