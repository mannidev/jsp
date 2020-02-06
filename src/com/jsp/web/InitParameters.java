package com.jsp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParameters extends HttpServlet
{ 
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    { 
        resp.setContentType("text/html");
        String email = getServletConfig().getInitParameter("email");
        
        PrintWriter writer = resp.getWriter();
        writer.println("Get servlet's init parameter<br>");
        writer.println("Email: " + email);
    }

}
