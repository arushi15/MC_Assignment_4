package com.example.arush.list1;

/**
 * Created by arush on 09-11-2016.
 */

public class todo
{
    private int id;
    private String title;
    private String details;
    public todo(int id, String title, String details)
    {
        this.id = id;
        this.title = title;
        this.details = details;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

}
