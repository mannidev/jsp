package com.jsp.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectExample extends HttpServlet
{ 
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String value = req.getParameter("process");
        
        if (value != null && value.equals("dispatch")) {
            req.setAttribute("msg", "Message from the dispatcher, unlike a redirect I process the requests myself!!!");
            RequestDispatcher dispatcher = req.getRequestDispatcher("process_dispatch.jsp");
            dispatcher.forward(req, resp);
            
        } else if (value != null && value.equals("redirect")) {
            String encode = URLEncoder.encode("You were redirected here because server was too lazy to process the request.", "UTF-8");
            resp.sendRedirect("process_redirect.jsp?msg="+ encode );
        }
        else {
            PrintWriter writer = resp.getWriter();
            writer.print("<h1>Unable to process request, try again with the correct handler param</h1>");
        }
    }

}
