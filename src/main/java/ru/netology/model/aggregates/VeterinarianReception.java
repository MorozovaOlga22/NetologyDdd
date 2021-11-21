package ru.netology.model.aggregates;

import ru.netology.model.entities.Owner;
import ru.netology.model.entities.Pet;
import ru.netology.model.entities.Veterinarian;

import java.util.Date;

public class VeterinarianReception {
    private final int id;
    private final Pet pet;
    private final Owner owner;
    private final Veterinarian veterinarian;
    private Date date;

    public VeterinarianReception(int id, Pet pet, Owner owner, Veterinarian veterinarian, Date date) {
        this.id = id;
        this.pet = pet;
        this.owner = owner;
        this.veterinarian = veterinarian;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public Pet getPet() {
        return pet;
    }

    public Owner getOwner() {
        return owner;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
