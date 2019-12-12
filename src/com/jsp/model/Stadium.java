package com.jsp.model;

import javax.json.JsonObject;

public class Stadium
{
    private int id;
    private String name;
    private String image;
    private String description;
    private String location;
    private String country;
    private int capacity;

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

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    protected void map(JsonObject obj)
    {
        if (obj.containsKey(StadiumMapKeys.ID))
            id = Integer.parseInt(obj.getString(StadiumMapKeys.ID));

        if (obj.containsKey(StadiumMapKeys.NAME))
            name = obj.get(StadiumMapKeys.NAME).toString();

        if (obj.containsKey(StadiumMapKeys.IMAGE))
            image = obj.get(StadiumMapKeys.IMAGE).toString();

        if (obj.containsKey(StadiumMapKeys.DESCRIPTION))
            description = obj.get(StadiumMapKeys.DESCRIPTION).toString();

        if (obj.containsKey(StadiumMapKeys.LOCATION))
            location = obj.get(StadiumMapKeys.LOCATION).toString();

        if (obj.containsKey(StadiumMapKeys.COUNTRY))
            country = obj.getString(StadiumMapKeys.COUNTRY);

        if (obj.containsKey(StadiumMapKeys.CAPACITY))
        {
            String value = obj.get(StadiumMapKeys.CAPACITY).toString().replace("\"", "");
            if (!value.equals("null") )
            {
                capacity = Integer.parseInt(value);
            } 
        }
            
    }

}

final class StadiumMapKeys
{
    static final String ID = "idTeam";
    static final String NAME = "strStadium";
    static final String IMAGE = "strStadiumThumb";
    static final String DESCRIPTION = "strStadiumDescription";
    static final String LOCATION = "strStadiumLocation";
    static final String COUNTRY = "strCountry";
    static final String CAPACITY = "intStadiumCapacity";

    private StadiumMapKeys()
    {
        throw new AssertionError();
    }
}
