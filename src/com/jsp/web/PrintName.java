package com.jsp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintName extends HttpServlet
{ 
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        
        resp.setContentType("text/html");
        
        PrintWriter out = resp.getWriter();
        out.println("<h5>");
        out.print("Your name is ");
        out.print(firstname);
        out.print(" ");
        out.print(lastname);
        out.println("</h5>");
        
    }
    

}
