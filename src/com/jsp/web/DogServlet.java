package com.jsp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.model.Dog;

public class DogServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        Dog dog = (Dog)getServletContext().getAttribute("dog");
        
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>");
        writer.println("So this dog was initialized by a listener, it's name is " + dog.getBreed());
        writer.println("</h1>");
    }
}
