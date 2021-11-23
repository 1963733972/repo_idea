package com.example.spring_boot.config;/*
 * @ClassName Sconfig
 * @Desc TODO
 * @Author 19637
 * @Date 2021/11/15 10:13
 * @Version 1.0
 */

import com.example.spring_boot.Bean.Pet;
import com.example.spring_boot.Bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.accept.ContentNegotiationStrategy;
import org.springframework.web.accept.ParameterContentNegotiationStrategy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@ConditionalOnMissingBean(name="pet1")
@RequestMapping
public class Sconfig {
    @Bean("pet1")
    public Pet pet1(){
        return new Pet();
    }
    @Bean
    public User user01(){
        return new User();
    }
    @Bean
   public  WebMvcConfigurer webMvcConfigurer() {
      return new WebMvcConfigurer() {
          @Override
          public void addInterceptors(InterceptorRegistry registry) {
              registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
          }
      };
    }
}
