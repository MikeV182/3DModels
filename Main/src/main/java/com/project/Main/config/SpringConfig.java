package com.project.Main.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.project.Main")
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
