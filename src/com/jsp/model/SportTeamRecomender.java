package com.jsp.model;

import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import javax.servlet.http.HttpServletResponse;

public class SportTeamRecomender
{
    private final HttpClient httpClient = HttpClient.newBuilder().version(Version.HTTP_2).build();

    public List<Team> getTeams(String sport, String country) throws IOException, InterruptedException
    {
        if (sport == null || sport.trim() == "")
            throw new IllegalArgumentException("sport argument passed cannot be null or empty string");
        
        if (country == null || country.trim() == "")
            throw new IllegalArgumentException("country argument passed cannot be null or empty string");
        
        String url = String.format("https://www.thesportsdb.com/api/v1/json/1/search_all_teams.php?s=%s&c=%s", sport, country);
        HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create(url))
                .build();

        BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String> response = httpClient.send(request, bodyHandler);

        List<Team> teams = new ArrayList<Team>();

        if (response.statusCode() == HttpServletResponse.SC_OK)
        {
            String jsonString = response.body();
            JsonObject jsonObj = getJsonObject(jsonString);
            teams = mapTeams(jsonObj);
        }

        return teams;
    }
    
    public List<Sport> getSports() throws IOException, InterruptedException 
    {
        String url = "https://www.thesportsdb.com/api/v1/json/1/all_sports.php";
        HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create(url))
                .build();

        BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String> response = httpClient.send(request, bodyHandler);

        List<Sport> sports = new ArrayList<Sport>();
        
        if (response.statusCode() == HttpServletResponse.SC_OK)
        {
            String jsonString = response.body();
            JsonObject jsonObj = getJsonObject(jsonString);
            sports = mapSports(jsonObj);
        }

        return sports;
    }

    private JsonObject getJsonObject(String jsonString)
    {
        StringReader reader = new StringReader(jsonString);
        JsonReader jsonReader = Json.createReader(reader);
        JsonObject jsonObj = jsonReader.readObject();
        return jsonObj;
    }

    private List<Team> mapTeams(JsonObject json)
    {
        List<Team> sportTeams = new ArrayList<Team>();

        if (json.containsKey("teams"))
        {
            JsonArray teams = json.get("teams").asJsonArray();
            Iterator<JsonValue> teamsIterator = teams.iterator();

            Team team = null;
            while (teamsIterator.hasNext())
            {
                JsonObject teamObj = teamsIterator.next().asJsonObject();
                team = new Team();
                team.map(teamObj);
                sportTeams.add(team);
            }
        }
        return sportTeams;
    }
    
    private List<Sport> mapSports(JsonObject json)
    {
        List<Sport> sports = new ArrayList<Sport>();

        if (json.containsKey("sports"))
        {
            JsonArray sportsCollection = json.get("sports").asJsonArray();
            Iterator<JsonValue> sportsIterator = sportsCollection.iterator();

            Sport sport = null;
            while (sportsIterator.hasNext())
            {
                JsonObject teamObj = sportsIterator.next().asJsonObject();
                sport = new Sport();
                sport.map(teamObj);
                sports.add(sport);
            }
        }
        return sports;
    } 
}
