package com.jsp.sandbox;

import java.util.List;

import com.jsp.model.Sport;
import com.jsp.model.SportTeamRecomender;
import com.jsp.model.Team;

public class SportsTeamsRestClient
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("**** teams ****");
            SportTeamRecomender recommender = new SportTeamRecomender();
            List<Team> sportTeams = recommender.getTeams("soccer", "england");
            
            for (Team team : sportTeams)
            {
                System.out.println(team.getName());
            }
            
            System.out.println();
            System.out.println("**** Sports ****");
            
            List<Sport> sports = recommender.getSports(); 
            for (Sport sport : sports)
            {
                System.out.println(sport.getName());
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
 
}
