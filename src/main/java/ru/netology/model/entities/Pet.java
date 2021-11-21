package ru.netology.model.entities;

import java.util.Date;

public class Pet {
    private final int id;
    private Owner mainOwner;
    private String name;
    private String biologicalSpecies;
    private Date dateOfBirth;
    private String comment;

    public Pet(int id, Owner mainOwner, String name, String biologicalSpecies, Date dateOfBirth, String comment) {
        this.id = id;
        this.mainOwner = mainOwner;
        this.name = name;
        this.biologicalSpecies = biologicalSpecies;
        this.dateOfBirth = dateOfBirth;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public Owner getMainOwner() {
        return mainOwner;
    }

    public void setMainOwner(Owner mainOwner) {
        this.mainOwner = mainOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiologicalSpecies() {
        return biologicalSpecies;
    }

    public void setBiologicalSpecies(String biologicalSpecies) {
        this.biologicalSpecies = biologicalSpecies;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
