package com.example.tomidea;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = request.getParameter("user");
        if(request.getParameter("user").equals("Kimberly")){
            System.out.println("user is kim");
        }
        String destPage = "main.jsp";
        String pass = request.getParameter("pass");
        if(request.getParameter("pass").equals("Soccer11!")){
            System.out.println("ok");
            session.setAttribute("user", "Kimberly");
            destPage = "main.jsp";
        }else{
            request.setAttribute("answer", "Wrong Password- it has not changed! (Use Soccer11!)");
            destPage = "login.jsp";
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
        dispatcher.forward(request,response);

    }

}
