package com.example.restTemplate.config;

import com.example.restTemplate.exception.RestTemplateResponseErrorHandler;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    private final RestTemplateResponseErrorHandler responseErrorHandler;

    public RestTemplateConfig(RestTemplateResponseErrorHandler responseErrorHandler) {
        this.responseErrorHandler = responseErrorHandler;
    }


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplateBuilder()
                .errorHandler(responseErrorHandler)
                .build();
    }
}
