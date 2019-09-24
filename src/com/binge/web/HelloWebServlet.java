package com.binge.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 创建的时候选择servlet，会自动在web.xml中进行配置,早期版本是有配置的，现在没有了
 */
@WebServlet(name = "HelloWebServlet" ,urlPatterns = "/hello")
public class HelloWebServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        System.out.println("welcome to web world!!!");
    }
}
