package com.jsp.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionExample extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        HttpSession session = req.getSession(false); // get session if it does not exist don't create.

        PrintWriter writer = resp.getWriter();
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        
        String destroySession = req.getParameter("destroy");
        
        if (destroySession != null && session != null) {
            session.invalidate(); //destroy session
            writer.println("<p>Session was manually destroyed...</p>");
        }

        if (session == null)
        {
            writer.println("<p>No session exists yet</p>");
            writer.println("<p>Creating new session...</p>");
            session = req.getSession(); // create session

            long creationTime = session.getCreationTime();
            Date date = new Date(creationTime);

            writer.println("<p>");
            writer.println("session created at: " + dateFormat.format(date));
            writer.println("</p>");

            session.setAttribute("createdAt", date);
            session.setMaxInactiveInterval(60); //invalidate session after a minute
        } else if (session.getAttribute("updatedAt") != null)
        {
            Date updatedAt = (Date) session.getAttribute("updatedAt");
             
            writer.println("<p>");
            writer.println(" session was last updated at: " + dateFormat.format(updatedAt));
            writer.println("</p>");
            
            writer.println("<p>Updating session with the last accessed time...</p>");
            session.setAttribute("updatedAt", new Date(session.getLastAccessedTime()));
        }
        else
        {
            Date createdAt = (Date) session.getAttribute("createdAt");

            if (createdAt == null)
            {
                writer.println("<p>An error occured, could not get session attribute <i>createdAt</i></p>");
            } else
            {
                writer.println("<p>");
                writer.println("Retreived session was created at: " + dateFormat.format(createdAt));
                writer.println("</p>");

                Date updatedAt = new Date();
                session.setAttribute("updatedAt", updatedAt);

                writer.println("<p>");
                writer.println("session was update at: " + dateFormat.format(updatedAt));
                writer.println("</p>");

            }  
        }
         
    }

}
