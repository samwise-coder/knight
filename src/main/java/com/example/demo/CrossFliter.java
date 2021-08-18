package com.example.demo;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class CrossFliter {
    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration config =new CorsConfiguration();
        config.addAllowedOrigin("*");
        config.setAllowCredentials(true);
        config.addAllowedMethod("*");
        config.addAllowedHeader("*");
        //添加映射路径
        UrlBasedCorsConfigurationSource configSource=new UrlBasedCorsConfigurationSource();
        configSource.registerCorsConfiguration("/**",config);
    }

}
