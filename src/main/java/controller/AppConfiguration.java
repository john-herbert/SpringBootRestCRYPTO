package controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import services.MACResponse;
import services.MACService;

@Configuration
public class AppConfiguration {

    @Bean
    public MACService macService() {
        return new MACService();
    }

    @Bean
    public MACResponse macResponse() {
        return new MACResponse();
    }

}