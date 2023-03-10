package com.codility.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = { "com.codility.external" })
public class AppConfiguration {
}
