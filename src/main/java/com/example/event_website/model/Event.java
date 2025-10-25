package com.example.event_website.model;

public class Event {
    private String title;
    private String category;
    private String description;
    private String image;

    public Event(String title, String category, String description, String image) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.image = image;
    }

    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public String getImage() { return image; }
}