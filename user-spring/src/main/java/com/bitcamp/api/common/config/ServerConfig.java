package com.bitcamp.api.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.datetime.DateFormatter;

@Configuration
public class ServerConfig {

    @Bean
    public String datePattern(){
        return "yyyy-MM-dd'T'HH:mm:ss.XXX";
    }

    @Bean
    public DateFormatter defaultDateFormatter(){
        return new DateFormatter(datePattern());
    }
    
}
