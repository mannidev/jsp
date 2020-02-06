package com.jsp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextExample extends HttpServlet
{ 
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    { 
        String email = getServletContext().getInitParameter("param");
        
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>");
        writer.println("Application Wide Email: " + email);
        writer.println("</h1>");
    }

}
