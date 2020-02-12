package com.jsp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UrlRewriting extends HttpServlet
{ 
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        
        HttpSession session = req.getSession();
        session.setAttribute("name", "url rewriting");
        
        writer.println("<html><body>");
        writer.println("<a href=\"" + resp.encodeURL("result.sh") +"\">Click Me</a>");
        writer.println("</body></html>");
    }

}
