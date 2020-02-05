package com.jsp.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
        
        req.setAttribute("firstname", firstname);
        req.setAttribute("lastname", lastname);
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("result.jsp");
        requestDispatcher.forward(req, resp);
    }

}
