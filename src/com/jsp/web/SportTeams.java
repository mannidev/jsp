package com.jsp.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.model.SportTeamRecomender;
import com.jsp.model.Team;

public class SportTeams extends HttpServlet 
{ 
    private static final long serialVersionUID = 1L;

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		try
        {
		    String sport = req.getParameter("sport");
	        SportTeamRecomender recomender = new SportTeamRecomender();
	        List<Team> teams = recomender.getTeams(sport, "usa");
	        
	        resp.setContentType("text/html");
	        
	        PrintWriter out = resp.getWriter();
	        out.println("<div>");
	        out.println("<b>Available Teams</b>");
	        out.println("</div>");
	        out.println("<div>");
	        out.println("<ul>");
	        for(Team team : teams)
	        {
	            out.println("<li>" + team.getName() + "</li>");
	        }
	        out.println("</ul>");
	        out.println("</div>");
        } catch (Exception e)
        {
            e.printStackTrace();
        }		        
	}
}
