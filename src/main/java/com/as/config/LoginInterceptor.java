package com.as.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.handler.Handler;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        //访问控制允许凭证
        response.setHeader("Access-Control-Allow-Credentials","true");
        //response.setHeader("Access-Control-Allow-Origin", "*"); 这里不能写成("*")号
        //允许谁跨域访问
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("http://localhost:8080/"));
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        //访问控制允许凭证
        response.setHeader("Access-Control-Allow-Credentials","true");
        //response.setHeader("Access-Control-Allow-Origin", "*"); 这里不能写成("*")号
        //允许谁跨域访问
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("http://localhost:8080/"));
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        //访问控制允许凭证
        response.setHeader("Access-Control-Allow-Credentials","true");
        //response.setHeader("Access-Control-Allow-Origin", "*"); 这里不能写成("*")号
        //允许谁跨域访问
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("http://localhost:8080/"));
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");

    }
}
