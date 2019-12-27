package com.jsp.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Counter
{
    private static int count;
    
    public static synchronized int getCount() {
        count++;
        return count;
    }
    
    public static String getTime() {
        Date date =  new Date();
        DateFormat format = new SimpleDateFormat("dd-mm-yyyy hh:mm:s");
        return format.format(date);
    }
}
