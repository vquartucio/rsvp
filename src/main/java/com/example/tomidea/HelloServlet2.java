package com.example.tomidea;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "HelloServlet2", value = "/HelloServlet2")
public class HelloServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("The get request was received");


        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello</h1>");
        response.getWriter().println("<h2>Welcome</h2>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("The post request was received");
    }

}
