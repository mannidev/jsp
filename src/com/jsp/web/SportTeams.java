package com.jsp.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        try
        {
            String sport = req.getParameter("sport");
            SportTeamRecomender recomender = new SportTeamRecomender();
            List<Team> teams = recomender.getTeams(sport, "usa");
            
            req.setAttribute("teams", teams);
            RequestDispatcher view = req.getRequestDispatcher("SportTeams.jsp");
            view.forward(req, resp);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
