package ru.netology.model.entities;

import java.util.Date;

public class Veterinarian {
    private final int id;
    private String name;
    private String document;
    private Date startDate;
    private Date endDate;
    private String description;

    public Veterinarian(int id, String name, String document, Date startDate, Date endDate, String description) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
