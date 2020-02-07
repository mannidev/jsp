package com.jsp.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import com.jsp.model.Dog;

public class ServletContextListener implements javax.servlet.ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent event)
    {
        ServletContext servletContext = event.getServletContext();
        String breed = servletContext.getInitParameter("breed");
        
        Dog dog = new Dog(breed); 
        servletContext.setAttribute("dog", dog);
    }

    @Override
    public void contextDestroyed(ServletContextEvent event)
    {
    }
}
