package ru.netology.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private final int id;
    private String name;
    private String document;
    private final List<Pet> pets = new ArrayList<>();

    public Owner(int id, String name, String document) {
        this.id = id;
        this.name = name;
        this.document = document;
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

    public List<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePet(int petId) {
        pets.removeIf(pet -> petId == pet.getId());
    }
}
