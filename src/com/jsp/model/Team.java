package com.jsp.model;

import java.util.Map;

import javax.json.JsonObject;

public class Team
{
    private int id;
    private String name;
    private String fullName;;
    private String yearFormed;
    private String sport;
    private League league;
    private String manager;
    private String country;
    private String badge;
    private String jearsy;
    private String logo;
    private String banner;
    private Stadium stadium;
    private String website;
    private String description;
    private Map<String, String> socialMedia;

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

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public String getYearFormed()
    {
        return yearFormed;
    }

    public void setYearFormed(String yearFormed)
    {
        this.yearFormed = yearFormed;
    }

    public String getSport()
    {
        return sport;
    }

    public void setSport(String sport)
    {
        this.sport = sport;
    }

    public League getLeague()
    {
        return league;
    }

    public void setLeague(League league)
    {
        this.league = league;
    }

    public String getManager()
    {
        return manager;
    }

    public void setManager(String manager)
    {
        this.manager = manager;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getBadge()
    {
        return badge;
    }

    public void setBadge(String badge)
    {
        this.badge = badge;
    }

    public String getJearsy()
    {
        return jearsy;
    }

    public void setJearsy(String jearsy)
    {
        this.jearsy = jearsy;
    }

    public String getLogo()
    {
        return logo;
    }

    public void setLogo(String logo)
    {
        this.logo = logo;
    }

    public String getBanner()
    {
        return banner;
    }

    public void setBanner(String banner)
    {
        this.banner = banner;
    }

    public Stadium getStadium()
    {
        return stadium;
    }

    public void setStadium(Stadium stadium)
    {
        this.stadium = stadium;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Map<String, String> getSocialMedia()
    {
        return socialMedia;
    }

    public void setSocialMedia(Map<String, String> socialMedia)
    {
        this.socialMedia = socialMedia;
    }

    protected void map(JsonObject obj)
    {
        if (obj.containsKey(TeamMapKeys.ID))
            id = Integer.parseInt(obj.getString(TeamMapKeys.ID));

        if (obj.containsKey(TeamMapKeys.NAME))
            name = obj.getString(TeamMapKeys.NAME);

        if (obj.containsKey(TeamMapKeys.FULLNAME))
            fullName = obj.get(TeamMapKeys.FULLNAME).toString();

        if (obj.containsKey(TeamMapKeys.YEARFORMED))
            yearFormed = obj.get(TeamMapKeys.YEARFORMED).toString();

        if (obj.containsKey(TeamMapKeys.SPORT))
            sport = obj.getString(TeamMapKeys.SPORT);

        if (obj.containsKey(TeamMapKeys.MANAGER))
            manager = obj.get(TeamMapKeys.MANAGER).toString();

        if (obj.containsKey(TeamMapKeys.COUNTRY))
            country = obj.getString(TeamMapKeys.COUNTRY);
        
        if (obj.containsKey(TeamMapKeys.BADGE))
            badge = obj.get(TeamMapKeys.BADGE).toString();
        
        if (obj.containsKey(TeamMapKeys.BANNER))
            banner = obj.get(TeamMapKeys.BANNER).toString();
        
        if (obj.containsKey(TeamMapKeys.WEBSITE))
            website = obj.get(TeamMapKeys.WEBSITE).toString();
        
        if (obj.containsKey(TeamMapKeys.DESCRIPTION))
            description = obj.get(TeamMapKeys.DESCRIPTION).toString();
        
        league = new League();
        league.map(obj);
        
        stadium = new Stadium();
        stadium.map(obj);

    }
}

final class TeamMapKeys
{
    static final String ID = "idTeam";
    static final String NAME = "strTeam";
    static final String FULLNAME = "strAlternate";
    static final String YEARFORMED = "intFormedYear";
    static final String SPORT = "strSport";
    static final String MANAGER = "strManager";
    static final String COUNTRY = "strCountry";
    static final String BADGE = "strTeamBadge";
    static final String JEARSY = "strTeamJersey";
    static final String LOGO = "strTeamLogo";
    static final String BANNER = "strTeamBanner";
    static final String WEBSITE = "strWebsite";
    static final String DESCRIPTION = "strDescriptionEN";

    private TeamMapKeys()
    {
        throw new AssertionError();
    }
}
