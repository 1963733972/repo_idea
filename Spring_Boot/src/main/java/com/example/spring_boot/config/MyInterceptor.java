package com.example.spring_boot.config;/*
 * @ClassName MyIntercepetor
 * @Desc TODO
 * @Author 19637
 * @Date 2021/11/17 9:23
 * @Version 1.0
 */

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(123);
        System.out.println(request.getServletPath());

        return false;
    }
}
