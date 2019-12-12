package com.jsp.model;

import javax.json.JsonObject;

public class Sport
{
    private int id;
    private String name;
    private String description;
    private String image;

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image = image;
    }
    
    protected void map(JsonObject obj)
    {
        if (obj.containsKey(SportsMapKeys.ID))
            id = Integer.parseInt(obj.getString(SportsMapKeys.ID));

        if (obj.containsKey(SportsMapKeys.NAME))
            name = obj.get(SportsMapKeys.NAME).toString().replace("\"", "");

        if (obj.containsKey(SportsMapKeys.IMAGE))
            image = obj.getString(SportsMapKeys.IMAGE);

        if (obj.containsKey(SportsMapKeys.DESCRIPTION))
            description = obj.getString(SportsMapKeys.DESCRIPTION); 
    }

}

final class SportsMapKeys
{
    static final String ID = "idSport";
    static final String NAME = "strSport";
    static final String IMAGE = "strSportThumb";
    static final String DESCRIPTION = "strSportDescription";

    private SportsMapKeys()
    {
        throw new AssertionError();
    }
}
