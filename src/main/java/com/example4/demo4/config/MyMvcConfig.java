package com.example4.demo4.config;

//使用WebMvcConfigurerAdapter可以来扩展SpringMvc的功能

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//@EnableWebMvc
//@RestController
public class MyMvcConfig implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        /** 设置视图路径的前缀 */
//        resolver.setPrefix( "/templates/" );
//        /** 设置视图路径的后缀 */
//        resolver.setSuffix( ".html" );
        return resolver;
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController( "/" ).setViewName( "sign_in" );
        registry.addViewController( "/sign.html" ).setViewName( "sign_in" );
//                        WebMvcConfigurer.super.addViewControllers(registry);
    }
}
