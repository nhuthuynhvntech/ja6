package com.example.ja6;

import com.example.ja6.interceptor.GoIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class interConfig implements WebMvcConfigurer {

    @Autowired
    GoIntercepter goIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(goIntercepter)
                .addPathPatterns("/**")
                .excludePathPatterns("/rest/**","/admin/**","/assets/**");
    }
}
