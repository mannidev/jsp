package com.jsp.model;

import javax.json.JsonObject;

public class League
{
    private int id;
    private String name;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    protected void map(JsonObject obj)
    {
        if (obj.containsKey(LeagueMapKeys.ID))
            id = Integer.parseInt(obj.getString(LeagueMapKeys.ID));
        
        if (obj.containsKey(LeagueMapKeys.NAME))
            name = obj.getString(LeagueMapKeys.NAME);
    }

}

final class LeagueMapKeys
{
    static final String ID = "idLeague";
    static final String NAME = "strLeague";

    private LeagueMapKeys()
    {
        throw new AssertionError();
    }
}
